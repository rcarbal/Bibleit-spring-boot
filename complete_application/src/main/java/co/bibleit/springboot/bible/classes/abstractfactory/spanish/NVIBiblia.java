package co.bibleit.springboot.bible.classes.abstractfactory.spanish;

import co.bibleit.springboot.bible.classes.abstractfactory.SpanishBibles;

// Nueva Version Internacional
public class NVIBiblia implements SpanishBibles {
    @Override
    public String getBibleString() {
        return "Nueva Version Internacional";
    }
}
