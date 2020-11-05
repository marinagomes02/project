package woo;

public class SaleTransaction extens Transaction {

    private int amount;
    private int deadline;

    public SaleTransaction(int transactionId, int amount, int deadline) {
        super(transactionId);
        this.amount = amount;
        this.deadline = deadline;
    }
}