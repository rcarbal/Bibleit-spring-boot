package co.bibleit.springboot.bible.classes.usedinfactories.spanish;

import co.bibleit.springboot.bible.interfaces.abstractfacoty.SpanishBibles;

// Nueva Version Internacional
public class NVIBiblia implements SpanishBibles {
    @Override
    public String getBibleString() {
        return "Nueva Version Internacional";
    }
}
