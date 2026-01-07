import java.time.LocalDateTime;

public class Receipt {
    private String Id;
    private Transaction transaction;
    private float change;
    private LocalDateTime dateTime;

    public Receipt(Transaction transaction){
        this.transaction = transaction;
        this.change = transaction.amountPaid() - transaction.getTotalCost();
        this.dateTime = LocalDateTime.now();
    }
    public float getChange() {
        return change;
    }
    public Transaction getTransaction() {
        return transaction;
    }

}
