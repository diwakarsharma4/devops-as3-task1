From openjdk:17
Volume /temp
ADD target/demo1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
