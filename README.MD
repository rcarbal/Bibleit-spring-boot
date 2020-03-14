# Bibleit-spring-boot
This application is in process and will replicate all the features and funtions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).


## Features
- Contains a Config Server for microservice configurations.
- Contains RESTful endpoints to return complete JSON for the NIV bible.

## Endpoints
- Retuns entire bible content in JSON form.

  GET request: /api/bible
 
## Browser UI URL
  http://localhost:8000

## PORTS
| Application | Port|
| :---: | :---: |
| Config Server | 8888 |
  
## Implementation
- Java 11.
- Built on Spring Boot, Spring core.
- Uses Service and DAO implementations.
- Parses JSON with json-simple library.
