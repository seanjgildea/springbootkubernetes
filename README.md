# Spring Boot Docker

Spring Boot Movies App that contains a test endpoint, Swagger 2, MySQL, Docker, Docker Compose, a basic Integration test and some init data. Uses Docker Hub as the Registry for CircleCI.

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
- JUnit

### Building / Running the App

- Execute the following commands to build the project, create the jar and launch the application

```./mvnw package && java -jar target/treadstone-1.0.jar```

- Test the application after this command succeeds
- http://localhost:8089/swagger-ui.html#/movie-controller/getAllMoviesUsingGET

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


