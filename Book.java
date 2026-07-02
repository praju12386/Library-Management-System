

public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;


    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }


    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }


    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Success: Book '" + title + "' has been successfully issued.");
        } else {
            System.out.println("Error: Sorry, '" + title + "' is already issued to someone else.");
        }
    }


    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Success: Book '" + title + "' has been successfully returned.");
        } else {
            System.out.println("Notice: This book is already present in the library.");
        }
    }


    public void display() {
        System.out.println(
                "Book ID: " + bookId +
                        ", Title: " + title +
                        ", Author: " + author +
                        ", Issued: " + isIssued
        );
    }
}