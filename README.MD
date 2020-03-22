# Bibleit-spring-boot Microservices

## About
This application is in process and will replicate all the features and functions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).
 Unlike the python flask application, which is a stand alone server, Bibleit-spring-boot implements a microservice design.


## Features
- Contains RESTful endpoints to return complete JSON for the NIV bible.


## Ports
|Application | Port|
| :--- | :---: |
| Config Server | 8888 |
| Eureka Naming Server | 8761 |
| Netflix Zuul API Gateway Server | 8765 |
| bible-parser-endpoints | 8100 |
| bible-data-parser | 8000 |


## Config Server endpoints

The config server is a centralized location that contains individual configurations for each microservice.

 Endpoint | URI|
| :--- | :--- |
| Bible-Parser Default| http://localhost:8888/bible-parser-endpoints/default |
| Bible-Parser QA| http://localhost:8888/bible-parser-endpoints/qa |
| Bible-Parser Dev| http://localhost:8888/bible-parser-endpoints/dev |
|Bible-Data-Endpoints Defaults| http://localhost:8888/bible-data-parser/default|
|Eureka Naming Server| http://localhost:8761/|
|Zipkin| http://localhost:9411/zipkin/|

## Eureka Naming Server
All instances of the microservices register to the naming server to enable service registration
and service discovery. 

 Endpoint | URI|
| :---: | :---: |
| Eureka Naming Server UI | http://localhost:8761/


## API Gateway Server
The server intercepts all api call, add functionality such as logging each call.

#### Run gateway server
- Run Eureka naming server
- Run service you want to test
- Run the Gateway server
- Call a service endpoint using the uri format shown below.

#### Test service endpoint through the gateway
- use http://localhost:8765/{microservice-name} / {microservice-endpoint}
- example http://localhost:8765/bible-data-parser/api/bible-data-parser/bible

The above should return the json response from the microservice, but through the api 
gateway.

 Service Endpoint | URI|
| :---: | :---: |
| Test Service Call | localhost:8765/{microservice-name}/{uri-endpoint} |

## Zipkin Server
The folder zipkin-server only contains the zipkin jar for starting the server. Run using 
the following commands.
```
set RABBIT_URI=amqp://localhost
java -jar zipkin.jar
```

## Bible-Data-Parser endpoint

The Bible-Data-Parser service parses json for http requests. 

 Endpoint | URI|
| :---: | :---: |
| Get Complete Bible Json | http://localhost:8000/api/bible-data-parser/bible

## Bible-Data-Endpoints endpoint

The Bible-Data-Endpoints is a centralized location that makes http requests to json parsers or other
any other dao.

 |Endpoint | URI|
 | :---: | :---: |
 |Get complete json from data parser | http://localhost:8100/api/bible-parser-endpoints/bible |


## How to run
* Download zip file or clone the project using [https://github.com/rcarbal/Bibleit-spring-boot].
* Using your IDE import individually each folder as project:
<pre>
    - spring-cloud-config-server
    - netflix-eureka-naming-server
    - bible-data-parser
    - bible-parser-endpoints    
    - netflix-zuul-api-gateway-server
</pre>
* Run each server using their corresponding Application file.
<pre>
    Example: BibleParserEndpointsApplication.java
</pre>
* Using your browser open http://localhost:8100/api/bible-parser-endpoints/bible
<pre>
    This calls the data parser to deliver json to its proper endpoint.
</pre>

## Test Load Balancing
<pre>
    - Run a separate instance of the bible-data-parser in a port 8001
        * Use VM options -Dserver.port=8001
    - Each GET request in localhost:8100/api/bible-parser-endpoints/port
      should return json object key "port" of 8000 or 8001.
</pre>
  
## Implementation
- Java 11 programming language.
- Spring Boot, Spring core.
- Microservices implements Spring Cloud.
- Spring Config Server
- OpenFeign rest service client.
- Ribbon load balancing.
- Eureka Naming Server for service discovery and communication.
- Zuul API Gateway server.
- Spring Cloud Sleuth request tracking .
- Zipkin server for request consolidation.

