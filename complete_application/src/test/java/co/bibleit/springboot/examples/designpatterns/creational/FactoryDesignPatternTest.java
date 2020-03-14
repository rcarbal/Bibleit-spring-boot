package co.bibleit.springboot.examples.designpatterns.creational;

import co.bibleit.springboot.bible.classes.abstractfactory.BibleFactory;
import co.bibleit.springboot.bible.classes.abstractfactory.FactoryProducer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryDesignPatternTest {

    @Test
    public void getPrimaryEnglishBibleVersionTest(){

        // get primary bible versions
        BibleFactory primaryEnglish = FactoryProducer.getFactory("primary");
        // get the english primary bible version
        String hEnglish = primaryEnglish.getEnglishBible().getBibleString();
        System.out.println(hEnglish);

        Assertions.assertEquals(hEnglish, "New International Version Bible");
    }
}
