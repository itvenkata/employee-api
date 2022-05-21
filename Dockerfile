FROM openjdk:8-jdk-alpine AS build
MAINTAINER chthota
EXPOSE 8090:8090
RUN mkdir app
COPY target/employee-api-0.0.1-SNAPSHOT.jar /app/employee-api.jar
ENTRYPOINT ["java","-jar","/app/employee-api.jar"]

