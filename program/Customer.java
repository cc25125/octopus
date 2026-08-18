package program;

public class Customer {
    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discout) {
        this.id = id;
        this.name = name;
        this.discount = discout;
    }

    public int getId() {
        return id;
    } 

    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.discount;
    }
}