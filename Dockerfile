FROM adoptopenjdk/openjdk11:latest as runtime
MAINTAINER chthota
EXPOSE 8090:8090
COPY target/employee-api-0.0.1-SNAPSHOT.jar employee-api.jar
ENTRYPOINT ["java","-jar","employee-api.jar"]

