FROM maven:3.8.8-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests package


FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/storage-node-0.0.1-SNAPSHOT.jar app.jar
VOLUME /data
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]