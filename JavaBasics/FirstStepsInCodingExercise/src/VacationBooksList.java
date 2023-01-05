import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_pages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int reading_time = count_pages / pages;
        int days_read = reading_time / days;
        System.out.print(days_read);
    }
}
