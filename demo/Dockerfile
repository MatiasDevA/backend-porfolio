FROM amazoncorretto:19-alpine-jdk
EXPOSE 8080
COPY target/demo-0.0.1-SNAPSHOT.jar porfolio-app.jar
ENTRYPOINT  ["java", "-jar" , "/porfolio-app.jar"]