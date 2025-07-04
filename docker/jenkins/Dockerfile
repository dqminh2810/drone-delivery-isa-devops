FROM jenkins/jenkins:lts

# Derived from https://github.com/getintodevops/jenkins-withdocker (miiro@getintodevops.com)

USER root

# Common
RUN apt-get update && apt-get -y --no-install-recommends install apt-transport-https ca-certificates curl gnupg2 software-properties-common lsb-release

# Java 8
#RUN apt-add-repository 'deb http://security.debian.org/debian-security sid main'
RUN echo "deb http://deb.debian.org/debian/ sid main" >> /etc/apt/sources.list && apt-get update
RUN apt-get -y install openjdk-8-jdk

# Maven
RUN apt-get update && apt-get -y --no-install-recommends install maven

# Switch Java version
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV PATH=$PATH:$JAVA_HOME/bin

# Docker compose
RUN curl -L "https://github.com/docker/compose/releases/download/1.25.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
RUN chmod +x /usr/local/bin/docker-compose

# Docker
RUN apt-get update
RUN install -m 0755 -d /etc/apt/keyrings
RUN curl -fsSL https://download.docker.com/linux/$(. /etc/os-release; echo "$ID")/gpg -o /etc/apt/keyrings/docker.asc
RUN chmod a+r /etc/apt/keyrings/docker.asc
RUN  echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/$(. /etc/os-release; echo "$ID") \
  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
  tee /etc/apt/sources.list.d/docker.list > /dev/null
RUN apt-get update
RUN apt-get -y --no-install-recommends install docker-ce
RUN apt-get clean

# Mono - Deprecated
# RUN apt-get -y --no-install-recommends install apt-transport-https dirmngr gnupg ca-certificates
# RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv-keys 3FA7E0328081BFF6A14DA29AA6A19B38D3D831EF
# RUN echo "deb https://download.mono-project.com/repo/debian stable-stretch main" | tee /etc/apt/sources.list.d/mono-official-stable.list
# RUN apt-get update
# RUN apt-get -y --no-install-recommends install mono-devel

# drop back to the regular jenkins user - good practice
# USER jenkins
