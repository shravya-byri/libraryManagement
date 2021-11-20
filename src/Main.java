public class Main {
    public static void main(String[] args) {
        Book b = new Book( "Anti fragile", true);
        Member chintu = new Member("chintu", true);
        chintu.borrowBook(b);
        chintu.returnBook(b);
        System.out.println(b.isAvailable);
    }

}
