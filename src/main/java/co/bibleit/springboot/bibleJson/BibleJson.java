package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.Book;
import co.bibleit.springboot.bible.ScriptureCollection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Component()
public class BibleJson implements JsonProcessor {

    //Extraction members
    private JSONObject parsedBibleJSON;
    private JSONObject extractedChapter;


    private final String PATH = "src/main/resources/json/NIV.json";
    private ScriptureCollection bible;
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
        extractBooks();
    }

    private void extractBooks() {
        if(parsedBibleJSON == null){
            System.out.println("Parsed JSON file is null");
        }else {
            System.out.println("Complete JSON bible found");
            for(Iterator chapterIter = parsedBibleJSON.keySet().iterator(); chapterIter.hasNext();) {
                String bibleChapter = (String) chapterIter.next();
                extractedChapter = (JSONObject) parsedBibleJSON.get(bibleChapter);

            }
        }
    }

    @Override
    public List<String> getBibleBookStringNames() {
//        ArrayList<String> bibleBooks = new ArrayList<>();
//
//        if (parsed) {
//            for (Iterator iterator = bible.keySet().iterator(); iterator.hasNext();) {
//                String book = (String) iterator.next();
//                bibleBooks.add(book);
//            }
//            return bibleBooks;
//        }
        return null;
    }

    @Override
    public Book getBook(String bibleBook) {
        // get a book from the JSON bible
        return null;
    }

    @Override
    public void getVerses(String book, String chapter) {

    }

    @Override
    public ScriptureCollection getBible() {
        return null;
    }
}
