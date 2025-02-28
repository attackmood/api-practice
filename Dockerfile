# base image
FROM openjdk:17-jdk-slim
# 작업 디렉토리 생성
WORKDIR /app

# GitHub Actions에서 빌드한 JAR 파일을 전달받아 실행
COPY build/libs/demo.jar app.jar

# 외부에서 접근할 포트
EXPOSE 8080
# 컨테이너 시작 시 스프링부트 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
