

public class Calc {

    public static void main(String[] arg) {
        if (arg.length == 0) {
            System.out.println("Недостаточно аргументов");
            return;
        } else if (arg.length != 3) {
            System.out.println("Вы ввели неверное количество аргументов");
            return;
        }
        try {
            double x = Double.parseDouble(arg[0]);
            char operation = arg[1].charAt(0);
            double y = Double.parseDouble(arg[2]);
            if (operation == '/' && y > -1e-12 && y < 1e-12) {
                System.out.println("Нельзя делить на ноль");
                return;
            }
            System.out.println(calc(x, y, operation));
        } catch (NumberFormatException ex) {
            System.out.println("Неправильный ввод числа");
        }
    }

    public static double calc(double x, double y, char operation) {

        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return Double.NaN;
        }
    }
}

