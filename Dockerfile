FROM maven:3 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17
VOLUME /tmp
COPY --from=build /app/target/*.jar service1.jar
ENTRYPOINT ["java", "-jar", "/service1.jar"]
