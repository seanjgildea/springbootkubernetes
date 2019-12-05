

FROM openjdk:8-jdk-alpine


VOLUME /tmp

# NEEDS MAVEN APT
# RUN ./mvnw package -DskipTests


ARG JAR_FILE=target/*.jar


COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]