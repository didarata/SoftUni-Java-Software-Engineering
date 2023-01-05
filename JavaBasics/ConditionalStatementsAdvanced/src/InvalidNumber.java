import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        boolean notValid = false;

        if (num >= 100.0 && num <= 200.0 || num == 0.0){
            notValid = false;
        } else {
            notValid = true;
        }

        if (notValid) {
            System.out.println("invalid");
        }
    }
}