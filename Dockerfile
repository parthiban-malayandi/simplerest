FROM amazoncorretto:latest
WORKDIR .
COPY target/SimpleRest-0.0.1-SNAPSHOT.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT ["java","-jar","app.jar"]
