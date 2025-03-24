# 우분투 기반의 이미지 사용
FROM ubuntu:20.04 AS build

# 필요한 패키지 설치 (curl, openjdk, gradle 등)
RUN apt-get update && \
    apt-get install -y curl unzip openjdk-17-jdk

# Gradle 설치
RUN curl -s https://get.gradle.org | bash

WORKDIR /app

# 프로젝트 파일 복사
COPY . /app

# Gradle 빌드 실행
RUN ./gradlew clean build --no-daemon --stacktrace

# 최종 실행 이미지
FROM openjdk:17-jdk-slim

# 빌드한 JAR 파일 복사
COPY --from=build /app/build/libs/*.jar /app/app.jar

# 앱 실행 명령
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

# 포트 설정
EXPOSE 8080
