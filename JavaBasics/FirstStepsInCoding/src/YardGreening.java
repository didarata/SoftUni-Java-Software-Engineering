import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSqrMeter = 7.61;
        double companyDiscount = 18;
        double green = Double.parseDouble(scanner.nextLine());
        double total_amount = green * priceSqrMeter;
        double discount = total_amount * companyDiscount;
        double result = total_amount - discount;
        System.out.printf("The final price is: %.2f lv.%n", result);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
