FROM openjdk:12
ADD target/DomainService-0.0.1-SNAPSHOT.jar docker-DomainService.jar
EXPOSE 6000
ENTRYPOINT ["java", "-jar", "docker-DomainService.jar"]