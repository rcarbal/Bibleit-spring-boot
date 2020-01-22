package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Book;
import co.bibleit.springboot.bible.ScriptureCollection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Component()
public class BibleJson implements JsonProcessor {

    //Extraction members
    private JSONObject parsedBibleJSON;


    private final String PATH = "src/main/resources/json/NIV.json";
    private boolean parsed = false;

    public BibleJson() {
        setupScriptureCollection();
    }

    @Override
    public void setupScriptureCollection() {
        JSONParser jsonParser = new JSONParser();
        HashMap<String, Book> books = new HashMap<>();

        try (FileReader reader = new FileReader(PATH)){

            // get json data
            Object obj = jsonParser.parse(reader);
            parsedBibleJSON = (JSONObject) obj;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        parsed = true;
    }

    @Override
    public List<String> getBookStringNames() {
        ArrayList<String> bibleBooks = new ArrayList<>();

        if (parsed) {
            for (Iterator iterator = parsedBibleJSON.keySet().iterator(); iterator.hasNext();) {
                String book = (String) iterator.next();
                bibleBooks.add(book);
            }
            return bibleBooks;
        }
        return null;
    }

    @Override
    public List<String> getBook(String bibleBook) {
        List<String> chapters = new ArrayList<>();

        for (int i = 1; i <= 50; i++){
            chapters.add("" + i);
        }
        return chapters;
    }


    @Override
    public List<String> getChaptersString() {
        List<String> chapters = new ArrayList<>();
        chapters.add("1");
        chapters.add("2");


        return chapters;
    }

    @Override
    public void getVerses(String book, String chapter) {

    }

    @Override
    public ScriptureCollection getBible() {
        return null;
    }
}
