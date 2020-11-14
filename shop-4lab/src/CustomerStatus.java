public enum CustomerStatus {
    NORMAL(0),
    VIP(10);

    private final double discount;

    CustomerStatus(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
