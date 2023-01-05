import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double total = 0;
        boolean isValid = false;

        switch (city){
            case "Sofia":
                if (sales >= 0 && sales <= 500){
                    total = sales * 0.05;
                } else if (sales > 500 && sales <= 1000){
                    total = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000){
                    total = sales * 0.08;
                } else if (sales > 100){
                    total = sales * 0.12;
                } else {
                    isValid = true;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500){
                    total = sales * 0.045;
                } else if (sales > 500 && sales <= 1000){
                    total = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000){
                    total = sales * 0.10;
                } else if (sales > 100){
                    total = sales * 0.13;
                } else {
                    isValid = true;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500){
                    total = sales * 0.055;
                } else if (sales > 500 && sales <= 1000){
                    total = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000){
                    total = sales * 0.12;
                } else if (sales > 100){
                    total = sales * 0.145;
                } else {
                    isValid = true;
                }
                break;
            default:
                isValid = true;
                break;
        }

        if (isValid){
            System.out.println("error");
        } else {
            System.out.printf("%.2f", total);
        }
    }
}