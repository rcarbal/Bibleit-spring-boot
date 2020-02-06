package co.bibleit.springboot.bible.classes.usedinfactories.english;

import co.bibleit.springboot.bible.interfaces.abstractfacoty.EnglishBibles;

// New International Version
public class NIVBible implements EnglishBibles {
    @Override
    public String getBibleString() {
        return "New International Version Bible";
    }
}
