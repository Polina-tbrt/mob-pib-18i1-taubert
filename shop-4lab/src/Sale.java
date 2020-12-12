public enum Sale {
    NO("нет акции", 0),
    BLACK_FRIDAY("черная пятница", 30);

    private final String actionName;
    private final double discount;

    Sale(String actionName, double discount) {
        this.actionName = actionName;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getActionName() {
        return actionName;
    }
}
