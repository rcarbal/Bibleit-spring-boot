package co.bibleit.springboot.bible.classes.usedinfactories;

import co.bibleit.springboot.bible.classes.usedinfactories.english.NIVBible;
import co.bibleit.springboot.bible.classes.usedinfactories.spanish.NVIBiblia;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.BibleFactory;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.EnglishBibles;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.SpanishBibles;

public class PrimaryBibleFactory implements BibleFactory {
    @Override
    public EnglishBibles getEnglishBible() {
        return new NIVBible();
    }

    @Override
    public SpanishBibles getSpanishBible() {
        return new NVIBiblia();
    }
}
