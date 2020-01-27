package co.bibleit.springboot.bible.classes;

import co.bibleit.springboot.bible.interfaces.Book;
import co.bibleit.springboot.bible.interfaces.Chapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public  class BibleDataContainer implements Map<String, Book> {
    private static Map<String, Book> completeBileCollection = new HashMap<>();

    @Override
    public int size() {
        return completeBileCollection.size();
    }

    @Override
    public boolean isEmpty() {
        return completeBileCollection.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return completeBileCollection.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return completeBileCollection.containsValue(value);
    }

    @Override
    public Book get(Object key) {
        return completeBileCollection.get(key);
    }

    @Override
    public Book put(String key, Book value) {
        return completeBileCollection.put(key, value);
    }

    @Override
    public Book remove(Object key) {
        return completeBileCollection.remove(key);
    }

    @Override
    public void putAll(Map<? extends String, ? extends Book> m) {

    }

    @Override
    public void clear() {
        completeBileCollection.clear();
    }

    @Override
    public Set<String> keySet() {
        return completeBileCollection.keySet();
    }

    @Override
    public Collection<Book> values() {
        return completeBileCollection.values();
    }

    @Override
    public Set<Entry<String, Book>> entrySet() {
        return completeBileCollection.entrySet();
    }

    private void initiateBibleData(){
        System.out.println("Retrieving complete bible data for " + getClass().getName() + "\n\n");

        // this code is temporary +++++++++++++++++++++++++++++++++++++++>
        Chapter aChapter = new BibleChapter();
        Map<String, Chapter> achapter = new HashMap<>();
        achapter.put("1", aChapter);
        Book book = new BibleBook("Genesis", achapter);
        completeBileCollection.put("Genesis", book);

        // ==================================================================>


//        // find the application context file
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        // get bean
//        JsonProcessor jsonProcessor = context.getBean("bibleJson", JsonProcessor.class);
//
//        List<String> allTheBooksInTheBible = jsonProcessor.getBookStringNames();
//
//        //Loop through all the books and build the Book object
//
//        for(String bookName: allTheBooksInTheBible){
//            Map<String, Chapter> completeBook = jsonProcessor.getBook(bookName);
//
//            Book bookObject = new BibleBook(bookName, completeBook);
//            completeBileCollection.put(bookName, bookObject);
//        }
//        context.close();
    }

    private void destroyBibleData(){
        completeBileCollection = null;
        System.out.println("\n\n");
        System.out.println( getClass().getName()+" : data has been destroyed\n\n");
    }
}


