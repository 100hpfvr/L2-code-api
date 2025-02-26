FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/L2API.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]