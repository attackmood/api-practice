FROM arm64v8/adoptopenjdk:11-jdk-hotspot-focal as builder

WORKDIR /app

# 프로젝트 소스 복사
COPY . .

# Gradle 빌드 명령 실행
RUN ./gradlew build

# 런타임 단계
FROM arm64v8/adoptopenjdk:11-jre-hotspot-focal

WORKDIR /app

# 빌드된 JAR 파일을 런타임 이미지로 복사
COPY --from=builder /app/build/libs/tour.jar /app/tour.jar

# Spring Boot 애플리케이션 실행 명령어
CMD ["java", "-jar", "/app/tour.jar"]
