# Docker environment for the DD System

## Build docker images
### Services
#### The "External Partners" image (.Net 4.8 + Mono 6.8.0)

The external partner binary is a .Net executable file (`server.exe`), with the following assumptions:

  - It relies on the `mono` environment,
  - when started, it will expose the services on port 9090,
  - the entry point of the image is the `server.exe` binary,
  - it must be run using the `/standalone` option to support daemon-like execution

[See the Dockerfile](partners/Dockerfile)

To build the docker launch the following command `./build.sh`

#### The "Drone Delivery" system image (J2E [java 8])

The internal implementation of the DD system will relies on the following assumptions:

  - it will be deployed on TomEE+, with Java 8,
  - we keep the default port for TomEE (_i.e._ 8080),
  - the external partner configuration must be declared when starting the container,
  - The system is considered _healthy_ as soon as TomEE is up and running

[See the Dockerfile](dd/Dockerfile)

To build the docker launch the following commands `./build.sh`

### Clients
#### The Client image (Java)

This image relies on an OpenJDK implementation (Java 8), and executes the JAR client (a single assembly) with the right option.

See the Dockerfiles in every client directories

To build the docker launch the following commands `./build.sh`

### CICD
Setup jenkins with environment - search for more details to complete setup [setup](jenkins/Readme.md)

[See the Dockerfile](jenkins/Dockerfile)

To build the docker launch the following commands `./build.sh`

## Composing the final system

The three part can now be used independently, as standalone components.

**DD System Services**
`docker-compose up -f docker-compose.service.yaml -d`

**Clients**
`docker-compose up -f docker-compose.client.yaml -d`

The client is started inside the assembly, and already running. Thus, one can attach and then detach the current context to the container. To attach the current context to a container, the `docker attach` command do the job. When attached, one can detach using the `^P ^Q` key combination.

`docker attach dd_client_boss_cli`

`docker attach dd_client_chargeur_cli`

`docker attach dd_client_garagiste_cli`

`docker attach dd_client_gestionnaire_cli`

`docker attach dd_client_manutentionnaire_cli`

`docker attach dd_client_service_client_cli`

**CICD**
`docker-compose up -f docker-compose.cicd.yaml -d`

Check CICD build & functional + integration test by [Jenkinsfile](../Jenkinsfile)
