public class Patron {
    private String name;
    private long contactInfo;
    private boolean membershipStatus;
    private int patronId;

    private static int patronIdTracker;

    public Patron(String name, long contactInfo, boolean membershipStatus, LibrarianManagement library) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.membershipStatus = membershipStatus;
        this.patronId = ++patronIdTracker;
        library.addPatron(this);
    }

    @Override
    public String toString(){
        return name + ", " + contactInfo + ", " + patronId + ", " + membershipStatus;
    }

}
