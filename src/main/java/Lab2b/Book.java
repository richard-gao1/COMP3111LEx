package Lab2b;

/*	Comp3111LEx\Lab2b\Book.java		*/
public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";
    }
    public Book(String argument[]) {
        /* construct the object with an array of chapter names */
        chapters = argument;

    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        if (i < 0 || i >= chapters.length)
            return null;
        return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}