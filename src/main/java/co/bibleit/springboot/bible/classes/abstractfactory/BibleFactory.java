package co.bibleit.springboot.bible.classes.abstractfactory;

public interface BibleFactory {
    EnglishBibles getEnglishBible();
    SpanishBibles getSpanishBible();
}
