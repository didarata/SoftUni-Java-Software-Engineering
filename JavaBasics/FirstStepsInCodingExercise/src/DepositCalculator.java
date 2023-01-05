import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositMonths = Integer.parseInt(scanner.nextLine());
        double yearTax = Double.parseDouble(scanner.nextLine()) / 100;
        double result = depositSum + depositMonths * ((depositSum * yearTax) / 12);
        System.out.println(result);
    }
}
