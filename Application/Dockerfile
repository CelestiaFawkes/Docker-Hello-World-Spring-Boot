FROM eclipse-temurin:21-jdk-alpine

EXPOSE 8080

COPY ./target/Application-0.0.1-SNAPSHOT.jar ROOT.jar

ENTRYPOINT ["java","-jar","ROOT.jar"]