import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oneProject = 3;
        String architect = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        double result = oneProject * projectsCount;
        System.out.printf("The architect %s will need %.0f hours to complete %d project/s.", architect, result, projectsCount);
    }
}
