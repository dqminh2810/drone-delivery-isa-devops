FROM jenkins/jenkins:lts

# Derived from https://github.com/getintodevops/jenkins-withdocker (miiro@getintodevops.com)

USER root

# Common
# RUN apt-get update && apt-get -y --no-install-recommends install apt-transport-https ca-certificates curl gnupg2 software-properties-common lsb-release
RUN apt-get update && apt-get -y --no-install-recommends install apt-transport-https \
        ca-certificates \
        curl

# Java 8 + Maven + Mono
RUN apt-get update && echo "deb http://deb.debian.org/debian/ sid main" >> /etc/apt/sources.list
RUN apt-get update && apt-get -y --no-install-recommends install openjdk-8-jdk \
        maven \
        mono-mcs

# Switch Java version in Maven
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

# Docker compose
RUN curl -L "https://github.com/docker/compose/releases/download/1.25.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
RUN chmod +x /usr/local/bin/docker-compose

# Docker
RUN apt-get update && curl -fsSL https://get.docker.com | sh
RUN usermod -aG docker jenkins
RUN apt-get clean

# USER jenkins
