import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chicken_menu = Double.parseDouble(scanner.nextLine()) * 10.35;
        double fish_menu = Double.parseDouble(scanner.nextLine()) * 12.40;
        double vegi_menu = Double.parseDouble(scanner.nextLine()) * 8.15;
        double total_menu_price = chicken_menu + fish_menu + vegi_menu;
        double desert = total_menu_price * 0.20;
        double total_sum = total_menu_price + desert + 2.50;
        System.out.print(total_sum);
    }
}
