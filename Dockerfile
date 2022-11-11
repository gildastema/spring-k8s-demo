FROM openjdk:17-jdk-alpine as builder
RUN mkdir -p app/source
COPY . app/source
WORKDIR app/source
RUN ./gradlew --refresh-dependencies build -x test

FROM openjdk:17-jdk-alpine
COPY --from=builder /app/source/build/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]