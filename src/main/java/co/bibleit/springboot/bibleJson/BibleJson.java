package co.bibleit.springboot.bibleJson;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component()
public class BibleJson implements JsonProcessor {

    private final String PATH = "src/main/resources/json/NIV.json";

    @Override
    public List<String> getBibleBooks() {
        ArrayList<String> bibleBooks = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(PATH)) {

            // Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONObject bible = (JSONObject) obj;

            for (Iterator iterator = bible.keySet().iterator(); iterator.hasNext();) {
                String book = (String) iterator.next();
                bibleBooks.add(book);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return bibleBooks;
    }

    @Override
    public List<String> getBookChapters(String bibleBook) {
        return null;
    }

    @Override
    public void getVerses(String book, String chapter) {

    }
}
