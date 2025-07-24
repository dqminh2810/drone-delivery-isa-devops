# Drone Delivery Project

### Components
- External service - .NET external service (C#) hosted by Mono
- SOAP web service - J2EE applicaiton hosted by TomEE (Tomcat big brother)
- Clients - simple java client (copy form command line interface)

### Build Project 
`./build.sh`

### How to launch integration test 
- Launch External service & DD System service `docker-compose up -f docker-compose.service.yaml -d`
- Launch integration test : `cd clients/integration_tests_cli` `mvn clean package`

### Interact with Jenkins
- Define CICD steps with Jenkinsfile
- [Check setup details](docker/jenkins/Readme.md)

### ARCHITECTURE

#### Software Architecture
![Software_architecture](https://github.com/dqminh2810/drone-delivery-isa-devops/blob/master/docs/drone-delivery-software_architecture.jpg)

#### CICD Architecture
![CICD_architecture](https://github.com/dqminh2810/drone-delivery-isa-devops/blob/master/docs/drone-delivery-CICD_architecture.jpg)
