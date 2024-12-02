import java.util.Scanner;

class Learning {

  public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);
    Liberary TanLib = new Liberary();
    var running = true;
    while (running) {
      System.out.println("===== welcome to " + Liberary.name + " =======");

      System.out.println("Choose an option");
      System.out.println("1. add a book");
      System.out.println("2. remove a book");
      System.out.println("3. list books");
      System.out.println("4. exit liberary");
      int choice = scann.nextInt();
      scann.nextLine();

      switch (choice) {
        case 1:
          System.out.println("give name");
          String name = scann.nextLine();

          System.out.println("give author");
          String author = scann.nextLine();
          TanLib.addBook(TanLib.Books.size(), name, author);

          System.out.println(" new book added .");
          System.out.println("view book list (type yes or no)?");
          String choise3 = scann.nextLine();
          if (choise3.equals("yes")) {
            TanLib.BooksList();
          } else if (choise3.equals("no")) {
            running = false;
          } else {
            System.out.println("invalid input !");
            running = false;
          }
          break;
        case 2:
          System.out.println("choose book u want to remove");
          TanLib.BooksList();
          int intBook = scann.nextInt();
          scann.nextLine();
          for (Book book : TanLib.Books) {
            if (book.id == intBook) {
              TanLib.RemoveBook(book);
              System.out.println("book removed !");
              running = false;

            }
          }

          break;

        case 3:
          TanLib.BooksList();

          running = false;

          break;
        case 4:
          running = false;

          break;

        default:
          break;
      }

    }

    scann.close();
  }

}
