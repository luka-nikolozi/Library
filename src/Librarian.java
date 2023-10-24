import java.util.ArrayList;

public class Librarian {
    private String firstName;
    private String lastName;

    private LibrarianManagement library;

    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Patron> patrons = new ArrayList<>();

    public Librarian(String firstName, String lastName, LibrarianManagement library) {
        this.firstName = firstName;
        this.lastName = lastName;
        books = library.getBooksList();
        patrons = library.getPatronsList();
        library.addLibrarian(this);
    }

    public void removeBook(Book removeBook, LibrarianManagement library, String firstName, String lastName, String password) {
        if(library.login(firstName, lastName, password)){
            System.out.println("book " + "with Id "+ (books.indexOf(removeBook) + 1) + " has been deleted");
            books.remove(removeBook);
        }
    }

    public void removePatron(Patron removePatron, LibrarianManagement library, String firstName, String lastName, String password) {
        if(library.login(firstName, lastName, password)){
            System.out.println("patron " + "with Id "+ (patrons.indexOf(removePatron) + 1) + " has been deleted");
            patrons.remove(removePatron);
        }
    }

    public void updateBookInfo(Book updateBook, String title, String author, String genre, LibrarianManagement library, String firstName, String lastName, String password){
        if(library.login(firstName, lastName, password)){
            Book newBook = new Book(title,author,genre,library);
            books.add(books.indexOf(updateBook),newBook);
            books.remove(newBook);
            books.remove(updateBook);
            System.out.println("update complete");
        }
    }

    public void updatePatronInfo(Patron updatePatron, String name, int contactInfo, boolean membershipStatus, LibrarianManagement library, String firstName, String lastName, String password){
        if(library.login(firstName, lastName, password)){
            Patron newPatron = new Patron(name,contactInfo,membershipStatus,library);
            patrons.add(patrons.indexOf(updatePatron),newPatron);
            patrons.remove(newPatron);
            patrons.remove(updatePatron);
            System.out.println("update complete");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////
    public void displayBooks() {
        for(Book book: books){
            System.out.println(book);
        }
    }

    public void displayPatrons() {
        for(Patron patron: patrons){
            System.out.println(patron);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName, String lastName, String password) {
        if(library.login(firstName, lastName, password)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String firstName, String lastName, String password) {
        if(library.login(firstName, lastName, password)) {
            this.lastName = lastName;
        }
    }


}

