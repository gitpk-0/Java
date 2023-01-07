public class Book {

    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pageCount;
    }

    public String toString() {
        return author + ", " + title + ", " + pageCount + " pages";
    }
}
