import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int withd = scanner.nextInt();
        int tall = scanner.nextInt();
        double procentage  = scanner.nextDouble() / 100;
        double area_aqua = lenght * withd * tall;
        double area_liters = area_aqua * 0.001;
        double result = area_liters  * (1 - procentage);
        System.out.print(result);
    }
}
