FROM openjdk:17-alpine

COPY ./target/ChasisService-0.0.1-SNAPSHOT.jar /

RUN sh -c 'touch ChasisService-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","/ChasisService-0.0.1-SNAPSHOT.jar"]

RUN chmod +x /ChasisService-0.0.1-SNAPSHOT.jar
