package co.bibleit.springboot.utilities;

public class BibleStaticInfo {

    private static String[] BIBLE_SECTIONS = {
            "Old Testament", "New Testament"
    };

    private static String[] BOOK_ORDER = {
            "Genesis", "Exodus", "Leviticus", "Numbers", "Deuteronomy", "Joshua", "Judges", "Ruth", "1 Samuel",
            "2 Samuel", "1 Kings", "2 Kings", "1 Chronicles", "2 Chronicles", "Ezra", "Nehemiah", "Esther", "Job", "Psalms",
            "Proverbs", "Ecclesiastes", "Song of Solomon", "Isaiah", "Jeremiah", "Lamentations", "Ezekiel", "Daniel",
            "Hosea", "Joel", "Amos", "Obadiah", "Jonah", "Micah", "Nahum", "Habakkuk", "Zephaniah", "Haggai", "Zechariah",
            "Malachi", "Matthew", "Mark", "Luke", "John", "Acts", "Romans", "1 Corinthians", "2 Corinthians", "Galatians",
            "Ephesians", "Philippians", "Colossians", "1 Thessalonians", "2 Thessalonians", "1 Timothy", "2 Timothy", "Titus",
            "Philemon", "Hebrews", "James", "1 Peter", "2 Peter", "1 John", "2 John", "3 John", "Jude", "Revelation"
    };

    private static String[] OLD_TESTAMENT_BOOKS = {
            "Matthew", "Mark", "Luke", "John", "Acts", "Romans", "1 Corinthians", "2 Corinthians", "Galatians", "Ephesians",
            "Philippians", "Colossians", "1 Thessalonians", "2 Thessalonians", "1 Timothy", "2 Timothy", "Titus",
            "Philemon", "Hebrews", "James", "1 Peter", "2 Peter", "1 John", "2 John", "3 John", "Jude", "Revelation"
    };

    private static String[] NEW_TESTAMENT_BOOKS = {
            "Genesis", "Exodus", "Leviticus", "Numbers", "Deuteronomy", "Joshua", "Judges", "Ruth", "1 Samuel",
            "2 Samuel", "1 Kings", "2 Kings", "1 Chronicles", "2 Chronicles", "Ezra", "Nehemiah", "Esther", "Job", "Psalms",
            "Proverbs", "Ecclesiastes", "Song of Solomon", "Isaiah", "Jeremiah", "Lamentations", "Ezekiel", "Daniel",
            "Hosea", "Joel", "Amos", "Obadiah", "Jonah", "Micah", "Nahum", "Habakkuk", "Zephaniah", "Haggai", "Zechariah",
            "Malachi"
    };

    public static String[] getBibleSections() {
        return BIBLE_SECTIONS;
    }

    public static void setBibleSections(String[] bibleSections) {
        BIBLE_SECTIONS = bibleSections;
    }

    public static String[] getBookOrder() {
        return BOOK_ORDER;
    }

    public static void setBookOrder(String[] bookOrder) {
        BOOK_ORDER = bookOrder;
    }

    public static String[] getOldTestamentBooks() {
        return OLD_TESTAMENT_BOOKS;
    }

    public static void setOldTestamentBooks(String[] oldTestamentBooks) {
        OLD_TESTAMENT_BOOKS = oldTestamentBooks;
    }

    public static String[] getNewTestamentBooks() {
        return NEW_TESTAMENT_BOOKS;
    }

    public static void setNewTestamentBooks(String[] newTestamentBooks) {
        NEW_TESTAMENT_BOOKS = newTestamentBooks;
    }
}
