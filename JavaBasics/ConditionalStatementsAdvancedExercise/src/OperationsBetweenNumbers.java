import java.util.Scanner;

import static java.lang.System.out;


public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        String evenOrOdd = "";
        double result = 0.0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                } else {
                    evenOrOdd = "odd";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                }
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                } else {
                    evenOrOdd = "odd";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                }
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                } else {
                    evenOrOdd = "odd";
                    out.printf("%d %s %d = %.0f - %s",n1,operator,n2, result, evenOrOdd);
                }
                break;
            case "/":
                if (n2 != 0) {
                    result = 1.0 * n1 / n2;
                    out.printf("%d %s %d = %.2f",n1, operator,n2, result);
                } else {
                    out.printf("Cannot divide %d by zero", n1);
                }
                break;
            case "%":
                if (n2 != 0) {
                    result = n1 % n2;
                    out.printf("%d %s %d = %.0f",n1, operator,n2, result);
                } else  {
                    out.printf("Cannot divide %d by zero", n1);
                }

                break;
        }
    }
}