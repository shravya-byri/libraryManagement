import java.util.UUID;

public class Book {
    String id;
    String name;
    Boolean isAvailable;

    public Book(String name, Boolean isAvailable) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.isAvailable = isAvailable;
    }
}
