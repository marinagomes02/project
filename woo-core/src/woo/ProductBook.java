package woo;

public class ProductBook extends Product {

    private String title;
    private String author;
    private String isbn;

    public ProductBook(String prodId, String supplierId, int price, int criticVal, int existVal, 
                String title, String author, String isbn) {        
        super(prodId, supplierId, price, criticVal, existVal);        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}