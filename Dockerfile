FROM jelastic/maven:3.9.5-openjdk-21 As build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/StudentManagementSystem-0.0.1-SNAPSHOT.jar StudentManagementSystem.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","StudentManagementSystem.jar"]