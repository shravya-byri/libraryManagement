import java.util.ArrayList;
import java.util.UUID;

public class Member {
    String id;
    String name;
    Boolean status;
    ArrayList<String> borrowedBooks;
    public Member(String memberName,Boolean status) {
       this.id = UUID.randomUUID().toString();
       this.name = memberName;
       this.status = status;
       this.borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(Book b) {
        if (b.isAvailable) {
            borrowedBooks.add(b.id);
            b.isAvailable = false;
        } else {
            System.out.println("bookId: " + b.id + " not available for userId: " + this.id);
        }
    }
    public void returnBook(Book b) {
        if(borrowedBooks.contains(b.id)) {
            this.borrowedBooks.remove(b.id);
            b.isAvailable = true;
        } else {
            System.out.println("bookId" + b.id + " not borrowed by" + this.id);
        }
    }
    public ArrayList<String> summaryOfBooks() {
        return this.borrowedBooks;

    }
}
