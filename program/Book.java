package program;

public class Book {
    private int id;
    private String name;
    private String author;
    private int stock;
    private double price;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    
    public Book(int id, String name, String author, double price) {
        this(id, name, author);
        this.setPrice(price);
    }
    
    public Book(int id, String name, String author, int stock, int price) {
        this(id, name, author);
        this.setStock(stock);
        this.setPrice(price);
    }

    public Book(int id, String name, String author, int stock) {
        this(id, name, author);
        this.setStock(stock);
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }

    public int getStock() {
        return this.stock;
    }

    public double getPrice() {
        
        return this.price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Estoque não pode ser menor que zero");
        }
        this.stock = stock;
    }

    public void setPrice(double price) {
        if (price <= 0.0) {
            throw new IllegalArgumentException("Preço não pode ser igual a zero");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.author + " " + this.stock + " " + this.price;
    }
}