import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static int NEXT_ID = 1;
    private List<Customer> customers;
    private List<Product> products;
    private List<Order> orders;
    private Sale currentSale;

    public Shop() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
        this.currentSale = Sale.NO;
        products.add(new Product(1, "Sweets", 137.70));
        products.add(new Product(2, "Cake", 210));
        products.add(new Product(3, "Pie", 27));
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void register(Customer customer) {
        customers.add(customer);
    }

    public Order createOrder(Customer customer, List<Product> products) {
        Order or = new Order(NEXT_ID++, customer, products, currentSale);
        orders.add(or);
        return or;
    }

    @Override
    public String toString() {
        return "customers=" + customers +
                ", products=" + products +
                ", orders=" + orders +
                ", currentSale=" + currentSale;
    }

    public void setCurrentSale(Sale currentSale) {
        this.currentSale = currentSale;
    }
}
