# Bibleit-spring-boot
This application is in process and will replicate all the features and funtions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).


## Features
- Contains a Config Server for microservice configurations.
- Contains RESTful endpoints to return complete JSON for the NIV bible.

## Endpoints
- Retuns entire bible content in JSON form.

  GET request: /api/bible
 
## Browser UI URL

## Ports
 Application | Port|
| :---: | :---: |
| Config Server | 8888 |
| bible-parser-endpoints | 8080 |
  
## Implementation
- Java 11.
- Built on Spring Boot, Spring core.
- Microservices implements Spring Cloud.
- Configuration Server implements Spring Config Server
