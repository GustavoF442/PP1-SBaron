FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/banco-facil-api-0.0.1-SNAPSHOT.jar app.jar

RUN groupadd -r app && useradd -r -g app app
USER app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]