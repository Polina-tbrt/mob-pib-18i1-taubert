import java.security.PublicKey;
import java.util.List;

public class Order implements Buyable {
    private final int id;
    private final Customer customer;
    private final List<Product> products;
    private final Sale currentSale;
    private boolean payed;


    public Order(int id, Customer customer, List<Product> products, Sale currentSale) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.currentSale = currentSale;
        this.payed = false;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        totalPrice *= (100 - currentSale.getDiscount()) / 100;
        totalPrice *= (100 - customer.getStatus().getDiscount()) / 100;
        return totalPrice;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Sale getCurrentSale() {
        return currentSale;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    @Override
    public String toString() {
        String result = "Order: " +
                "id " + id +
                ", customer: " + customer +
                ", products: ";
        for (Product product : products) {
            result += product.getName() + " " + product.getPrice() + ", ";
        }
        result += " currentSale: " + currentSale + ",  payed: " + payed;
        return result;
    }
}
