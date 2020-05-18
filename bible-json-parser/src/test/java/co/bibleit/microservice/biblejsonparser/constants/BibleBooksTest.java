package co.bibleit.microservice.biblejsonparser.constants;

import org.junit.jupiter.api.Test;

class BibleBooksTest {

    @Test
    public void testEnum_TEST(){

        for (BibleBooks pl : BibleBooks.values()){
            System.out.println(pl.getBookValue());
        }
    }
}