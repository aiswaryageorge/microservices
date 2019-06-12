FROM openjdk:11.0.3-jdk-stretch
ADD ./target/eurekaserver-0.0.1-SNAPSHOT.jar /app/music/eurekaserver-0.0.1-SNAPSHOT.jar
WORKDIR app/music
ENTRYPOINT ["java","-jar","eurekaserver-0.0.1-SNAPSHOT.jar"]