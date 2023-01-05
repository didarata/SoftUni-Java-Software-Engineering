import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String tripType = "";


        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    tripType = "Camp";
                    budget *= 0.30;
                    break;
                case "winter":
                    tripType = "Hotel";
                    budget *= 0.70;
                    break;
            }
        } else if (budget<=1000){
            destination = "Balkans";
            switch (season) {
                case "summer":
                    tripType = "Camp";
                    budget *= 0.40;
                    break;
                case "winter":
                    tripType = "Hotel";
                    budget *= 0.80;
                    break;
            }
        }else {
            destination = "Europe";
            tripType = "Hotel";
            budget *=0.90;
        }
        System.out.printf("Somewhere in %s%n%s - %.2f",destination, tripType,budget);
    }
}