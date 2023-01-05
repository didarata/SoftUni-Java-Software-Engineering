import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pack_pens = 5.80;
        double pack_cleaner = 1.20;
        double pack_markers = 7.20;
        int count_pens = Integer.parseInt(scanner.nextLine());
        int count_markers = Integer.parseInt(scanner.nextLine());
        int count_cleaners = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine()) / 100;
        double total_price = (pack_pens * count_pens) + (pack_markers * count_markers) + (pack_cleaner * count_cleaners);
        double result = total_price - (total_price * discount);
        System.out.println(result);
    }
}
