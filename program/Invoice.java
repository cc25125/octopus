package program;

public class Invoice {
    private int id;
    private Customer customer;
    private int nBooks = 0;
    private Book books[] = new Book[1000];
    private int quantities[] = new int[1000];

    public Invoice(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    } 

    public Customer getCustomer() {
        return customer;
    }
    
    public int indexOfBook(Book book) {
        for (int i = 0; i < nBooks; i++) {
            if (books[i] == book) {
                return i;
            }
        }
        return -1;
    }

    public boolean addBook(Book book, int quantity) {
        if (book.getStock() < quantity) { return false; }
        if (indexOfBook(book) == -1) {
                books[nBooks] = book;
                quantities[nBooks] = quantity;
                nBooks++;
                return true;
            }
        return false;
    } 

    public boolean removeBook(Book book) {
        int i = indexOfBook(book);
        if (!(i == -1)) {
                books[i] = null;
                quantities[i] = 0;
                nBooks--;
                return true;
            }
            i++;
        return false;
    }
    
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < nBooks; i++) {
            total += books[i].getPrice() * quantities[i];
        }
        return total;
    }

    public double getTotalAfterDiscount() {
        double totalAfterDiscount = 0.0;
        for (int i = 0; i < nBooks; i++) {
            totalAfterDiscount += books[i].getPrice() * quantities[i];
        }
        totalAfterDiscount -= customer.getDiscount();
        // totalAfterDiscount -= totalAfterDiscount * customer.getDiscount();
        return totalAfterDiscount;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.customer.getId() + " " + this.customer.getName() + " " +  this.customer.getDiscount() + ", " + this.getTotal();
    }
}