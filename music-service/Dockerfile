FROM openjdk:11.0.3-jdk-stretch
ADD ./target/music-service-0.0.1-SNAPSHOT.jar /app/music/music-service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","music-service-0.0.1-SNAPSHOT.jar"]