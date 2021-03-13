FROM openjdk:8-jre-alpine3.9
COPY ./target/scientific-calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
ENTRYPOINT exec java -jar /scientific-calculator-1.0-SNAPSHOT.jar
