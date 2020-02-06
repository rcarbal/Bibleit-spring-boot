package co.bibleit.springboot.bible.interfaces.abstractfacoty;

public interface BibleFactory {
    EnglishBibles getEnglishBible();
    SpanishBibles getSpanishBible();
}
