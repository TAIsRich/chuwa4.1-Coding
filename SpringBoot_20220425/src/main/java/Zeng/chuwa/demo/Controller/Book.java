package Zeng.chuwa.demo.Controller;

public class Book {
    private String booName;
    private String author;
    private String description;
    private String ISBN;

    public Book(String booName, String author, String description, String ISBN) {
        this.booName = booName;
        this.author = author;
        this.description = description;
        this.ISBN = ISBN;
    }

    public String getBooName() {
        return booName;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBooName(String booName) {
        this.booName = booName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
