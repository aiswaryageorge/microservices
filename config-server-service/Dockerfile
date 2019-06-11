FROM openjdk:11.0.3-jdk-stretch
ADD ./target/config-server-service-0.0.1-SNAPSHOT.jar /app/music/config-server-service-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","config-server-service-0.0.1-SNAPSHOT.jar"]