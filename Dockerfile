# Stage 1: Build Stage using Gradle with JDK 11
FROM gradle:7.5.1-jdk11 AS builder
WORKDIR /home/gradle/project
COPY --chown=gradle:gradle . .
RUN gradle clean bootJar --no-daemon

# Stage 2: Runtime Stage using OpenJDK 11
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=builder /home/gradle/project/build/libs/tour.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

