package woo;

public class OrderTransaction extends Transaction {

    private String supplierId;
    private int orderCost;

    public OrderTransaction(int transactionId, int orderCost, String supplierId) {
        super(transactionId);
        this.supplierId = supplierId;
        this.orderCost = orderCost;
    }
}