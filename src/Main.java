public class Main {
    public static void main(String[] args) {

        LibrarianManagement library = LibrarianManagement.getInstance();
        Librarian librarian = new Librarian("luka", "sakhvadze", library);
        Book book1 = new Book("book1","author1","scary", library);
        Book book2 = new Book("book2","author2","comedy", library);
        librarian.removeBook(book1, library,"luka", "sakhvadze", "password");
        librarian.updateBookInfo(book2,"book3","author2","scary", library,"luka", "sakhvadze","password");
        librarian.removeBook(book2, library,"luka", "sakhvadze", "password");
        librarian.displayBooks();

        Patron patron1 = new Patron("Luka Sakhvadze",592312570,true, library);
        librarian.displayPatrons();
        librarian.updatePatronInfo(patron1,"Luka Sakhvadze",591977703, false, library,"luka", "sakhvadze","password");
        librarian.displayPatrons();
    }
}