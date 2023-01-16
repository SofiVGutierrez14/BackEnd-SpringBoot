FROM amazoncorretto:11-alpine-jdk
MAINTAINER sofi
COPY target/Sofi-0.0.1-SNAPSHOT.jar Sofi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Sofi-0.0.1-SNAPSHOT.jar"]


