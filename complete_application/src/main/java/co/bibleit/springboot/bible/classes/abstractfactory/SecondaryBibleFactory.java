package co.bibleit.springboot.bible.classes.abstractfactory;

import co.bibleit.springboot.bible.classes.abstractfactory.english.ESVbible;
import co.bibleit.springboot.bible.classes.abstractfactory.spanish.RVR1960Biblia;

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
