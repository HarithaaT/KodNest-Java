
import java.util.Scanner;

public class InputWithConditionsAndLoops {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Read the number of days
// Calculate the total and display the progress status
        int practiceDays = scanner.nextInt();

        int totalSolved = 0;

        for (int i = 0; i < practiceDays; i++) {

            int problemsSolved = scanner.nextInt();

            totalSolved += problemsSolved;

        }

        System.out.println("Total solved: " + totalSolved);

        String status;

        if (totalSolved >= 20) {
            status = "Strong progress";
        } else if (totalSolved >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Status: " + status);

        scanner.close();

    }
}
