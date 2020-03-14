package co.bibleit.springboot.bible.classes.abstractfactory.english;

import co.bibleit.springboot.bible.classes.abstractfactory.EnglishBibles;

// New International Version
public class NIVBible implements EnglishBibles {
    @Override
    public String getBibleString() {
        return "New International Version Bible";
    }
}
