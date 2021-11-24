package Db;

import java.util.UUID;

public class BorrowedBooksDTO {
    String borrowedId;
    String memberId;
    String bookId;
    BorrowedState state;

    public BorrowedBooksDTO(String memberId,String bookId, BorrowedState state) {
        this.borrowedId = UUID.randomUUID().toString();
        this.memberId = memberId;
        this.bookId = bookId;
        this.state = state;
    }

    public enum BorrowedState { RETURNED, BORROWED, LOST }

}
