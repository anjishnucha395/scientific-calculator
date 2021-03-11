FROM openjdk:8-jre-alpine3.9
MAINTAINER Anjishnu Chakrabarti anjishnuchakrabarti@gmail.com
COPY ./target/scientific-calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "scientific-calculator-1.0-SNAPSHOT.jar"]
