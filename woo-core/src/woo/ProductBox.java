package woo;

public class ProductBox extends Product {

    private String serviceType;

    public Box(String prodId, String supplierId, int price, int criticVal, 
                int existVal, String serviceType) {        
        super(prodId, supplierId, price, criticVal, existVal);
        this.serviceType = serviceType;
    }
}