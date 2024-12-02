import java.util.ArrayList;

public class User {
    public int id;
    public String name;
    public ArrayList<Book> BorrowBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.BorrowBooks = new ArrayList<>();

    }

    public void BorrowBook(Book book) {
        if (book.isBorrowed) {
            System.out.println("the book " + book.title + " is already borrowed");
        } else {
            book.BorrowBook();
            this.BorrowBooks.add(book);
        }

    }

    public void returnBook(Book book) {
        BorrowBooks.remove(book);
        book.ReturnBook();
    }

    public void BooksList() {
        if (BorrowBooks.isEmpty()) {
            System.out.println("no borrowed books.");

        } else {
            System.out.println("Borrowed books : ");

            for (Book book : BorrowBooks) {
                System.out.println(book.id + ". " + book.title);

            }
        }

    }

}
