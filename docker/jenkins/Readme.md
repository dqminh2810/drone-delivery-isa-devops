### Jenkins build when git push

- You need to run Jenkins on a server, for example IBM cloud
- Get an IBM id and connect you
- Get to [this page](https://cloud.ibm.com/kubernetes/clusters)
- This can not be done because we can't add cluster with student account
- We also tried to put Jenkins on Azur but without success

So we can use ngrok to simulate a distant server
- See [ngrok.com](https://ngrok.com/)
- See the tutorial [here](https://k6.io/blog/bootstrap-your-ci-with-jenkins-and-github)
- Cliquez sur votre projet > Configurer > Ce qui déclencle le build
  - Cocher GitHub hook trigger for GITScm polling
  - Save
- Go to github project > Settings > Webhooks
  - Add webhook
  - Copy the server url (or ngrok url givent [there](https://dashboard.ngrok.com/status))
  - Under Content-typse select application/json
  - Add webhook

Expose jenkins

`./ngrok http 8083`

### Jenkins setup

- Go to localhost:8083 (or ip if under docker toolbox).
- Type `docker exec -it dd_jenkins /bin/bash` in a terminal then do `cat /var/jenkins_home/secrets/initialAdminPassword`
- Enter the password given in the command prompt.
- Install default plugins
- Crate user, example :
    - user
    - password
- If repository is private :
    - Return to the command prompt
    - `docker exec -it dd_jenkins /bin/bash`
    - `ssh-keygen -t rsa` then enter then enter then enter
    - `cat /root/.ssh/id_rsa.pub`
    - copy the key
    - go to your github project > settings > deploy key > add your key
    - In the left menu in jenkins click on Identifiants > System > Identifiants globaux > Ajouter des identifiants
    - Choose ssh username
    - Choose Global, set id and description, your github username and the key and passphrase
- Create a new pipeline project
- Choose your github repository under "Gestion de code source".
- get to the github project code page and get the ssh connection
- Build -> choose maven version name previously entered
- Build -> Invoquer les cibles Maven de haut niveau > POM > /var/jenkins_home/workspace/Drone-Delivery-Snapshot-1.0.0/j2e/pom.xml
- Then click save
- Define build then, Launch a build !

### Artifactory setup

After the first installation :
- `admin` and `password` to log in
- `mysuperpassword` as the new password
- skip the SET BASE URL
- skip PROXY
- check maven to create repositories
- click on the left under "Artifactory" > "Artifacts"
  - Set me up
  - copy the settings to the pom.xml under `<!-- Artifactory configuration parameters -->`
  - edit the settings.xml with your address
  - Docker path: `localhost`

To perform operations related to the artifactory by using `mvn` command. i.e:
- `mvn install -s ./settings.xml`
- `mvn deploy -s ./settings.xml`

### Link Artifactory Jenkins

- Get to Jenkins > Plugins
- Install artifactory
- Get to Administrer jenkins -> configuration
- Under Artifactory click "Add Artifactory Server"
- set the id and the url like `http://dockerIpBecauseLocalhostNotWorks:8082/artifactory`
- set the credentials then test and if ok save
- get to your project > configurer
    - Artifactory configuration
    - Artifactory Server select the one previously added
    - Click on Refresh Repositories and select the good ones in target releases and snapshots
    - Build -> remove the old maven
    - Ajouter une étape au build -> Invoke Artifactory Maven 3
    - Root POM : $workspace/j2e/pom.xml
    - Goals and options: clean package
    - Artifactory is linked to jenkins