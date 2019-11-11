FROM openjdk:8
ADD target/spring-cicd-0.0.1-SNAPSHOT.jar spring-cicd.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring-cicd.jar"]