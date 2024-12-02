import java.util.ArrayList;

public class Liberary {
    public static String name;
    public ArrayList<Book> Books;

    static{
        name="Tanger liberary";
    }
    public Liberary(){
        this.Books= new ArrayList<>();
    }
     protected void addBook(int id,String title,String author){
        Book newBook= new Book(id, title, author);
        this.Books.add(newBook);

    }
    protected void RemoveBook(Book book){
        this.Books.remove(book);

    }
    protected void BooksList(){
       for(Book book: this.Books){
        System.out.println(book.id+". "+book.title);

       }

    }
}
