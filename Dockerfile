FROM openjdk:17
MAINTAINER shahbazakbar
COPY target/vote-casting-service-1.0.jar vote-casting-service.jar
ENTRYPOINT ["java","-jar","/vote-casting-service.jar"]