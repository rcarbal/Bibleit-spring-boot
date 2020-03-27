package co.bibleit.springboot.bible.classes.abstractfactory;

import co.bibleit.springboot.bible.classes.abstractfactory.english.NIVBible;
import co.bibleit.springboot.bible.classes.abstractfactory.spanish.NVIBiblia;

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
