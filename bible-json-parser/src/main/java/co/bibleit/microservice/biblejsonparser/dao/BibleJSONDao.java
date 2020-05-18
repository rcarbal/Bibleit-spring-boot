package co.bibleit.microservice.biblejsonparser.dao;

import org.json.simple.JSONObject;

public interface BibleJSONDao {
    JSONObject getBible();
    String[] getBooks();
    JSONObject getBook(String bookName);
}
