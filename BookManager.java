import java.util.ArrayList;

public class BookManager{

  private ArrayList<Book> books = new ArrayList<Book>();

  public void addBook(Book book){
    books.add(book);
  }

  public ArrayList<Book> getBooks(){
    return books;
  }

  public void setBookAsRead(String bookName){
    books.stream()
      .filter(x -> x.name.equals(bookName))
      .findFirst()
      .ifPresent(x -> x.isRead = true);
    
  }
}
