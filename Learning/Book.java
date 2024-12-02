public class Book {
    public int id;
    public String title;
    public String auther;
    public boolean isBorrowed;

    public Book(int id,String title,String auther){
        this.id=id;
        this.title=title;
        this.auther=auther;
        this.isBorrowed=false;

    }
    public void BorrowBook(){ 
        this.isBorrowed=true;

    }
    public void ReturnBook(){ 
        this.isBorrowed=false;

    }
    public void getDetails(){

        System.out.println("this is book details: "+this.title);
    }



    
}
