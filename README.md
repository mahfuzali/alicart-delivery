# alicart-delivery
A delivery service API built using Java Spring Boot

Technology used:
* Java Spring Boot with Java 11
* Docker
* PostgresSQL

To run this application:
1. Create a postgres database using docker container
`docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine`
2. Access the postgres container shell:
`docker exec -it postgres-spring bin/bash`
3. Create the database inside the container:
`CREATE DATABASE deliverydb`
