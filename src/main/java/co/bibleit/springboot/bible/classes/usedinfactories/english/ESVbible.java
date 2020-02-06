package co.bibleit.springboot.bible.classes.usedinfactories.english;

import co.bibleit.springboot.bible.interfaces.abstractfacoty.EnglishBibles;

// English Standard Version
public class ESVbible implements EnglishBibles {
    @Override
    public String getBibleString() {
        return "English Standard Version Bible";
    }
}
