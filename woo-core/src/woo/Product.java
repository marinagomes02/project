package woo;

public class Product {

    private String prodId;
    private String supplierId;
    private int price;
    private int criticVal;
    private int existVal;

    public Product(String prodId, String supplierId, int price, int criticVal, int existVal) {
        this.prodId = prodId;
        this.supplierId = supplierId;
        this.price = price;
        this.criticVal = criticVal;
        this.existVal = existVal;
    }
}