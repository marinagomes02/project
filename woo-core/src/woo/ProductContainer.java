package woo;

public class ProductContainer extends ProductBox {

    private String serviceLevel;

    public Container(String prodId, String supplierId, int price, int criticVal, 
                    int existVal, String serviceType, String serviceLevel) {        
        super(prodId, supplierId, price, criticVal, existVal, serviceType);
        this.serviceLevel = serviceLevel;
    }
}