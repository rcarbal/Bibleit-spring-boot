# Bibleit-spring-boot
This application is in process and will replicate all the features and funtions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).


## Features
- Contains a Config Server for microservice configurations.
- Contains RESTful endpoints to return complete JSON for the NIV bible.

## Ports
 Application | Port|
| :---: | :---: |
| Config Server | 8888 |
| bible-parser-endpoints | 8080 |

## Config Server endpoints

 Endpoint | URI|
| :---: | :---: |
| Default| http://localhost:8888/bible-parser-endpoints/default |
| QA| http://localhost:8888/bible-parser-endpoints/qa |
| Dev| http://localhost:8888/bible-parser-endpoints/dev |
  
## Implementation
- Java 11.
- Built on Spring Boot, Spring core.
- Microservices implements Spring Cloud.
- Configuration Server implements Spring Config Server
