FROM openjdk:8-jdk-alpine

WORKDIR /usr/app

COPY ./target/UdpProducer-0.0.1-SNAPSHOT.jar ./

CMD ["java", "-jar", "UdpProducer-0.0.1-SNAPSHOT.jar"]