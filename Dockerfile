FROM openjdk:13-jdk-alpine
ADD target/dock.jar dock.jar
ENTRYPOINT ["java","-jar","dock.jar"]