FROM openjdk:8-jre-slim

MAINTAINER pateluday07@gmail.com

VOLUME /tmp

COPY /target/docker-postgres-springboot-demo-0.0.1-SNAPSHOT.jar docker-postgres-springboot-demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","docker-postgres-springboot-demo-0.0.1-SNAPSHOT.jar"]