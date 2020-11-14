import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String args[]) {
        Shop shop = new Shop();
        shop.register(new Customer(1, "Petr", CustomerStatus.NORMAL));
        shop.register(new Customer(2, "Fedor", CustomerStatus.VIP));
        Scanner sc = new Scanner(System.in);
        int m;
        do {
            System.out.println("1. Список продуктов");
            System.out.println("2. Создать заказ");
            System.out.println("3. Показать покупателей");
            System.out.println("4. BlackFriday");
            System.out.println("5. Выход");
            m = sc.nextInt();
            switch (m) {
                case 1:
                    for (Product product : shop.getProducts()) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    createOrder(shop);
                    break;
                case 3:
                    for (Customer customer : shop.getCustomers()) {
                        System.out.println(customer);
                    }
                    break;
                case 4:
                    shop.setCurrentSale(Sale.BLACK_FRIDAY);
                    break;
                case 5:
                    System.out.println("Выход");

            }
        }
        while (m != 5);
    }

    private static void createOrder(Shop shop) {
        List<Product> cart = new ArrayList<>();
        System.out.println("Введите номер необходимого продукта");
        System.out.println("1. Sweets");
        System.out.println("2. Cake");
        System.out.println("3. Pie");
        System.out.println("Нажмите 4 для выхода");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
            switch (n) {
                case 1:
                    cart.add(shop.getProducts().get(0));
                    break;
                case 2:
                    cart.add(shop.getProducts().get(1));
                    break;
                case 3:
                    cart.add(shop.getProducts().get(2));
                    break;
                default:
                    break;
            }
        } while (n != 4);
        Order or = shop.createOrder(shop.getCustomers().get(1), cart);
        System.out.println(or);
    }
}
