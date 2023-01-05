import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double protective_nylon = 1.50;
        double paint = 14.50;
        double paint_thinner = 5.00;
        double bags = 0.40;
        int count_nylon = Integer.parseInt(scanner.nextLine());
        int count_paint = Integer.parseInt(scanner.nextLine());
        int count_thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum_nylon = (count_nylon + 2) * protective_nylon;
        double sum_paint = (count_paint + (count_paint*0.10)) * paint;
        double sum_thinner = count_thinner * paint_thinner;
        double sum_total = sum_nylon + sum_paint + sum_thinner + bags;
        double sum_workers = (sum_total * 0.30) * hours;
        double total_sum = sum_total + sum_workers;
        System.out.print(total_sum);
    }
}
