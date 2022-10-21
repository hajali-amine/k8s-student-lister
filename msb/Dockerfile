FROM openjdk:17-jdk-alpine as build
COPY . /home/gradle/source/
WORKDIR /home/gradle/source/datasource
ENV HOSTNAME=0.0.0.0
ENV PORT=8080
RUN ./gradlew build

FROM openjdk:17-jdk-alpine as server
COPY --from=build /home/gradle/source/datasource/build/libs/datasource-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
EXPOSE ${PORT}
ENTRYPOINT ["java", "-jar", "datasource-0.0.1-SNAPSHOT.jar"]
