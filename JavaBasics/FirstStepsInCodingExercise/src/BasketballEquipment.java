import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year_tax = Integer.parseInt(scanner.nextLine());
        double shoes = year_tax - (year_tax * 0.40);
        double training_cloths = shoes - (shoes * 0.20);
        double ball = training_cloths / 4;
        double accessories = ball / 5;
        double total_sum = shoes + training_cloths + ball + accessories + year_tax;
        System.out.println(total_sum);
    }
}
