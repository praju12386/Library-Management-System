import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.issueBook();
                System.out.println("Book Issued Successfully");
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.returnBook();
                System.out.println("Book Returned Successfully");
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}