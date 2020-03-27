package co.bibleit.springboot.bible.classes.abstractfactory.english;

import co.bibleit.springboot.bible.classes.abstractfactory.EnglishBibles;

// English Standard Version
public class ESVbible implements EnglishBibles {
    @Override
    public String getBibleString() {
        return "English Standard Version Bible";
    }
}
