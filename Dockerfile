FROM openjdk:17
ADD /target/Passport-1.0-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]