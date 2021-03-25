public class Book {
    private String title;  //this contains the title of the book
    private String author;  //this contains the author name
    private String bookLink;  //this contains the address of the book.
    private int bookNumber;  //this is the number of the book

    public Book(String title, String author, String bookLink, int bookNumber) {
        this.title = title;
        this.author = author;
        this.bookLink = bookLink;
        this.bookNumber = bookNumber;
    }

    public String getBookLink() {
        return this.bookLink;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookLink='" + bookLink + '\'' +
                ", bookNumber=" + bookNumber +
                '}';
    }
}
