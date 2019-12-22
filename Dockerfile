
FROM maven:3.6.3-ibmjava-8-alpine


VOLUME /tmp


EXPOSE 8043 3306


ARG JAR_FILE=target/*.jar


COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]