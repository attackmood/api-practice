# 1. 빌드 단계: Gradle 공식 이미지를 사용하여 애플리케이션 빌드
FROM gradle:7.5.1-jdk17 AS builder
WORKDIR /home/gradle/project
# 소스 전체를 복사 (gradle wrapper, build.gradle 등 포함)
COPY . .
# Gradle 빌드 실행 (gradle wrapper를 사용하는 경우 "./gradlew"로 대체 가능)
RUN gradle clean build --no-daemon

# 2. 실행 단계: 빌드된 JAR 파일을 경량 OpenJDK 이미지에 복사하여 실행
FROM openjdk:17-jdk-slim
WORKDIR /app
# builder 단계에서 생성된 jar 파일 복사 (여러 jar 파일이 생성될 수 있으므로 필요한 jar를 선택)
COPY --from=builder /home/gradle/project/build/libs/*.jar app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

