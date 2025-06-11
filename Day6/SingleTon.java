package Day6;

public class SingleTon {

    public static void main(String[] args) {
      Book b= Book.getBook();
      Book c = Book.getBook();
      System.out.println(b.hashCode() + " " + c.hashCode()
      );
      System.out.println(b==c);
    }
}
class Book{
    String name;
    String author;
    String publisher;
    static Book b= null;
    private  Book(String name, String author, String publisher) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }
    public static synchronized Book getBook() {
        if(b==null){
            b= new Book("Sureh","Ramesh", "Naryan");
        }
        return b;
    }
}
