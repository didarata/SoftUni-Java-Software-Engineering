import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceCatFood = 4;
        double priceDogFood = 2.5;
        int countDogFood = Integer.parseInt(scanner.nextLine());
        int countCatFood = Integer.parseInt(scanner.nextLine());
        double result = (countDogFood * priceDogFood) + (countCatFood * priceCatFood);
        System.out.print(result);
    }
}
