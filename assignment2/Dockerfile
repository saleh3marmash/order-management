FROM openjdk:17
WORKDIR /app
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ./target/assignment2-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
