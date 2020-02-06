package co.bibleit.springboot.bible.classes.usedinfactories.spanish;

import co.bibleit.springboot.bible.interfaces.abstractfacoty.SpanishBibles;

// Reyna Valera 1960 Version
public class RVR1960Biblia implements SpanishBibles {
    @Override
    public String getBibleString() {
        return "Reina Valera 1960 Version";
    }
}
