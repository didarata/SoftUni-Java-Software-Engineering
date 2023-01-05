import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double roomOnePerson = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;

        int daysToStay = Integer.parseInt(scanner.nextLine()) - 1;
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceForHoliday = 0.0;
        double totalPrice = 0.0;

        switch(roomType) {
            case "room for one person":
                priceForHoliday = daysToStay * roomOnePerson;
                if(grade.equals("positive")) {
                    totalPrice = priceForHoliday + (priceForHoliday * 0.25);
                }else {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.10);
                }
                break;

            case "apartment":
                priceForHoliday = daysToStay * apartment;
                if(daysToStay <= 10) {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.30);
                }else if(daysToStay <= 15) {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.35);
                }else {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.50);
                }

                if(grade.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                }else {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;

            case "president apartment":
                priceForHoliday = daysToStay * presidentApartment;
                if(daysToStay <= 10) {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.10);
                }else if(daysToStay <= 15) {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.15);
                }else {
                    totalPrice = priceForHoliday - (priceForHoliday * 0.20);
                }

                if(grade.equals("positive")) {
                    totalPrice = totalPrice + (totalPrice * 0.25);
                }else {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;

        }
        System.out.printf("%.2f", totalPrice);
    }
}
