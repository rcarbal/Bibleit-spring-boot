package co.bibleit.springboot.bible.classes.usedinfactories;

import co.bibleit.springboot.bible.classes.usedinfactories.english.ESVbible;
import co.bibleit.springboot.bible.classes.usedinfactories.spanish.RVR1960Biblia;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.BibleFactory;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.EnglishBibles;
import co.bibleit.springboot.bible.interfaces.abstractfacoty.SpanishBibles;

public class SecondaryBibleFactory implements BibleFactory {

    @Override
    public EnglishBibles getEnglishBible() {
        return new ESVbible();
    }

    @Override
    public SpanishBibles getSpanishBible() {
        return new RVR1960Biblia();
    }
}
