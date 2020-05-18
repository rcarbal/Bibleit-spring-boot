package co.bibleit.microservice.biblejsonparser.utils.josnExtractor;

import co.bibleit.microservice.biblejsonparser.constants.BibleBooks;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class JSONObjectParserImpl implements JSONObjectParser {

    @Override
    public String[] getBooks() {
        String[] array = new String[66];

        int i = 0;
        for (BibleBooks book : BibleBooks.values()){
            array[i] = book.getBookValue();
            i++;
        }

        return array;
    }

    @Override
    public JSONObject getBook(String book, JSONObject parsedBibleJSON) {
        JSONObject extractedBook = (JSONObject) parsedBibleJSON.get(book);
        return extractedBook;
    }
}
