

FROM openjdk:8-jdk-alpine


VOLUME /tmp

# NEEDS MAVEN APT
# RUN ./mvnw package -DskipTests

EXPOSE 8043 3306

# RUN apt-get install -y /tmp/mysql-connector-java-5.1.34.jar

# RUN curl -L -o /mysql-connector-java-5.1.34.jar https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.34/mysql-connector-java-5.1.34.jar

# ENV CLASSPATH=/mysql-connector-java-5.1.34.jar:${CLASSPATH}


ARG JAR_FILE=target/*.jar


COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]