FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/demo-3.5.7.jar /app/demo-3.5.7.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-3.5.7.jar"]do