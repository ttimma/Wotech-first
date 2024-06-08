import java.util.Scanner;

public class Main { 

    public static BookManager bookManager = new BookManager();

    public static void main(String[] args) {
         while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 to add a book to your reading list");
            System.out.println("Press 2 to show the reading list");
            System.out.println("Press 3 to set a book as read");
            var userInput = scanner.nextLine();
            if(userInput.equals("1")){
                createBook();
            }else if(userInput.equals("2")){
                showReadingList();
            }else if(userInput.equals("3")){
                showReadingList();
                System.out.println("Enter the name of the book you have finished reading:");
                  var bookName = scanner.nextLine();
                  bookManager.setBookAsRead(bookName);
            }else{
                break;
            }
        }
    }

    public static void createBook(){
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Please enter the name of the book");
        var name = scanner.nextLine();
    
        System.out.println("Please enter the description of the book");
        var description = scanner.nextLine();

        var book = new Book(name, description);
        bookManager.addBook(book);
    }

      public static void showReadingList(){
            var books = bookManager.getBooks();
            for(var book : books){
                System.out.println("This is a BOOK");
                System.out.println(book.name);
                System.out.println(book.description);
                if (book.isRead == false) {
                  System.out.println("This book has not been read yet");
                    } else {
                  System.out.println("You have already finished reading this book");
                    }
            }
        }
    }
