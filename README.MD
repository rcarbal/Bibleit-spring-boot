# Bibleit-spring-boot
This application is in process and will replicate all the features and funtions the python flask backend server application that runs the live site [Bibleit.co](https://www.bibleit.co/).


## Features
- Contains RESTful endpoints to return complete JSON for the NIV bible. 
- (In process) Searches for any word exact or inexact matches throughout the entire Holy Bible.
- (In process) Presents search results for matches in separate categories for exact and inexact.
- (In process) Displays word definitions of matches and links to synomym words found in the bible.
- (In Process) Shows suggested questions for user's search bar input.

## Endpoints
- Retuns entire bible content in JSON form.

  GET request: /api/bible
  
  
## Implementation
- Java 11.
- Built on Spring Boot, Spring core.
- Uses Service and DAO implementations.
- Parses JSON with json-simple library.
