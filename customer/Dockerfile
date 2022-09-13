FROM openjdk:8-jdk-alpine

WORKDIR /srv
COPY    . .
RUN     ./gradlew test build

ENTRYPOINT ["java"]
CMD ["-jar", "build/libs/customer-0.0.1-SNAPSHOT.jar"]