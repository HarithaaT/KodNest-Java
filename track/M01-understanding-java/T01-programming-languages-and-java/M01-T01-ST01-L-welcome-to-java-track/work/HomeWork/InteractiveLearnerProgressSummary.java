
import java.util.*;

public class InteractiveLearnerProgressSummary {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        int practiceDays = sc.nextInt();

        int totalProblems = 0;

        int problemsSolvedCount;

        for (int i = 1; i <= practiceDays; i++) {
            problemsSolvedCount = sc.nextInt();

            totalProblems += problemsSolvedCount;
        }

        double dailyAverage = totalProblems / practiceDays;

        String status = (dailyAverage >= 5.0) ? "Consistent" : "Needs consistency";

        System.out.println("Learner: " + fullName);

        System.out.println("Total solved:" + totalProblems);

        System.out.println("Daily average: " + dailyAverage);

        System.out.println("Status:" + status);

        sc.close();

    }
}
