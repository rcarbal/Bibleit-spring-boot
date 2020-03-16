# Bibleit-spring-boot Microservices

## About
This application is in process and will replicate all the features and functions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).
 Unlike the python flask application, which is an individual server, Bibleit-spring-boot implements a microservice design.


## Features
- Contains a Config Server for microservice configurations.
- Each microservice runs on their corresponding port.
- Contains RESTful endpoints to return complete JSON for the NIV bible.

## Ports
 Application | Port|
| :---: | :---: |
| Config Server | 8888 |
| bible-parser-endpoints | 8100 |
| bible-data-parser | 8000 |

## Config Server endpoints

 Endpoint | URI|
| :---: | :---: |
| Default| http://localhost:8888/bible-parser-endpoints/default |
| QA| http://localhost:8888/bible-parser-endpoints/qa |
| Dev| http://localhost:8888/bible-parser-endpoints/dev |

## Bible-Data-Parser endpoint
 Endpoint | URI|
| :---: | :---: |
| Get Complete Bible Json | http://localhost:8000/api/bible-data-parser/bible

## Bible-Data-Endpoints endpoint
 |Endpoint | URI|
 | :---: | :---: |
 |Get complete json from data parser | http://localhost:8100/api/bible-parser-endpoints/bible |


## How to run
* Download zip file or clone the project using [https://github.com/rcarbal/Bibleit-spring-boot].
* Using your IDE import individually each folder as project:
<pre>
    - spring-cloud-config-server
    - bible-data-parser
    - bible-parser-endpoints    
</pre>
* Run each server using their corresponding Application file.
<pre>
    Example: BibleParserEndpointsApplication.java
</pre>
* Using your browser open http://localhost:8100/api/bible-parser-endpoints/bible
<pre>
    This calls the data parser to deliver json to its proper endpoint.
</pre>
  
## Implementation
- Java 11.
- Built on Spring Boot, Spring core.
- Microservices implements Spring Cloud.
- Configuration Server implements Spring Config Server
