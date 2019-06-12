FROM openjdk:11.0.3-jdk-stretch
ADD target/zuulapi-0.0.1-SNAPSHOT.jar /app/music/zuulapi-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","zuulapi-0.0.1-SNAPSHOT.jar"]