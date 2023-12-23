public class Library {
    public String libraryName;
    public Book book1, book2, book3;
    public void addBook(Book book, int slot){
        switch (slot){
            case 1 : book1 = book;
            break;
            case 2 : book2 = book;
            break;
            default : book3 = book;
        }
    }
    public void removeBook(int slot){
        switch (slot){
            case 1 : book1 = null;
            break;
            case 2 : book2 = null;
            break;
            default : book3 = null;
        }
    }
    public void printLibraryDetails(){
        System.out.println("Library: " + libraryName);
        System.out.println("");
        if (book1 != null) {book1.printDetails();}
        else {System.out.println("No book in this slot.");}
        System.out.println("");
        if (book2 != null) {book2.printDetails();}
        else {System.out.println("No book in this slot.");}
        System.out.println("");
        if (book3 != null) {book3.printDetails();}
        else {System.out.println("No book in this slot.");}
    }
    public void checkBookAvailability(int slot){
        switch (slot){
            case 1 : System.out.println(book1 != null ? book1.title + " is available." : "Book in slot "+ slot + " is not available.");
            break;
            case 2 : System.out.println(book2 != null ? book2.title + " is available." : "Book in slot "+ slot + " is not available.");
            break;
            default : System.out.println(book3 != null ? book3.title + " is available." : "Book in slot "+ slot + " is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice){
        switch (slot){
            case 1 : { 
                System.out.println(book1 != null ? "Updated price of "+book1.title + " to $" + newPrice + ".": "No book in this slot.");
                if (book1 != null) {book1.price = newPrice;}
                break;
            }
            case 2 : { 
                System.out.println(book2 != null ? "Updated price of "+book2.title + " to $" + newPrice + ".": "No book in this slot.");
                if (book2 != null) {book2.price = newPrice;}
                break;
            }
            default : {
                System.out.println(book3 != null ? "Updated price of "+book3.title + " to $" + newPrice + ".": "No book in this slot.");
                if (book3 != null) {book3.price = newPrice;}
            }
        }
    }
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
        }else {
            System.out.println("No book in this slot.");
        }
    }
}
