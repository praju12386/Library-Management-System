public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();


        myLibrary.addBook(new Book(101, "Java OOP Concepts"));
        myLibrary.addBook(new Book(102, "Data Structures"));


        User user1 = new User("Rahul Sharma", 1);


        System.out.println("--- Library Books Inventory ---");
        myLibrary.displayBooks();


        System.out.println("\n--- Testing Book Issue ---");
        myLibrary.issueBook(101);


        System.out.println("\n--- Updated Books Inventory ---");
        myLibrary.displayBooks();
    }
}
