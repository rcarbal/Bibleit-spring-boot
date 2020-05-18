package co.bibleit.microservice.biblejsonparser.utils.josnExtractor;

import org.json.simple.JSONObject;

public interface JSONObjectParser {
    
    String[] getBooks();
    JSONObject getBook(String book, JSONObject parsedBibleJSON);
}
