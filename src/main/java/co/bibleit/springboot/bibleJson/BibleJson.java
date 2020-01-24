package co.bibleit.springboot.bibleJson;

import co.bibleit.springboot.bible.BibleChapter;
import co.bibleit.springboot.bible.Book;
import co.bibleit.springboot.bible.Chapter;
import co.bibleit.springboot.bible.ScriptureCollection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    public Map<String, Chapter> getBook(String bibleBook) {

        Map<String, Chapter> completeBook = new HashMap<>();
        JSONObject extractedBibleBook = null;

        // contains all the chapters and their verses from book
        extractedBibleBook = (JSONObject) parsedBibleJSON.get(bibleBook);

        if (parsed){
            if(extractedBibleBook == null){
                return null;
            }


            for(Iterator iterator = extractedBibleBook.keySet().iterator(); iterator.hasNext();){
                BibleChapter chapter = new BibleChapter();
                Map<String, String> verses = new HashMap<>();

                String chapterString = (String) iterator.next();
                chapter.setChapterNumber(chapterString);


                JSONObject allVersesJson = (JSONObject) extractedBibleBook.get(chapterString);

                // nested for loop to retrieve all verses
                for (Iterator verseIterator = allVersesJson.keySet().iterator(); verseIterator.hasNext();){

                    String verseString  = (String) verseIterator.next();
                    String verse = (String) allVersesJson.get(verseString);

                    verses.put(verseString, verse);
                }

                // After this for loop add verses to chapter object
                chapter.setVerses(verses);
                completeBook.put(chapterString, chapter);
            }
        }

        return completeBook;
    }

    @Override
    public Chapter getChapter(Map<String, Chapter> book, String chapter) {

        return book.get(chapter);
    }

    @Override
    public ScriptureCollection getBible() {
        return null;
    }
}
