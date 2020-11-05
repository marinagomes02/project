package woo;

public class Supplier {

    private String supplierId;
    private String supplierName;
    private String supplierAddress;
    private boolean transactionAtive;

    public Supplier(String supplierId, String supplierName, String supplierAddress) {        
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.transactionAtive = true;
    }
}