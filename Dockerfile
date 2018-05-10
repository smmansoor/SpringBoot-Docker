from openjdk:8
ADD target/SpringBootDocker-0.0.1-SNAPSHOT.jar SpringBootDocker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBootDocker-0.0.1-SNAPSHOT.jar"]