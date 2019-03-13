FROM openjdk:12
ADD target/APIGatewayService-0.0.1-SNAPSHOT.jar docker-APIGateway.jar
EXPOSE 6006
ENTRYPOINT ["java", "-jar", "docker-APIGateway.jar"]