public class Customer {
    private final int id;
    private final String name;
    private final CustomerStatus status;

    public Customer(int id, String name, CustomerStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status;
    }
}
