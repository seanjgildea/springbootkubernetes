# Spring Boot Docker

Spring Boot demo app that contains a simple RESTful API, Swagger 2 doc, a MySQL db , Actuator, AP4k for K8s, Docker and Docker Compose

### Tech

Tech used in this project

- Spring Boot 2.2
- Java 1.8
- MySQL
- Maven
- Actuator
- Swagger 2
- Docker
- Lombok
- JPA

### Building / Running the App

- Execute the following commands to build the project and create the jar

```./mvnw package && java -jar target/treadstone-1.0.jar```

### Prerequisites

- Docker 
- Docker Compose

### To build the Dockerfile

``` docker build -t treadstone . ```

### Start the Docker image as a service

``` docker container run -d -p 8043:8080 treadstone ```

### To run in Docker Compose

``` docker-compose --project-name=treadstone --d```

### To view the Swagger docs

``` http://localhost:8043/swagger-ui.html#/ ```

### To publish the build to Docker Hub

``` docker-compose bundle --push-images ```


