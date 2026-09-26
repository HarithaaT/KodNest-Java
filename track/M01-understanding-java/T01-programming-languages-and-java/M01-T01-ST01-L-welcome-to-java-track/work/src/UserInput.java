
import java.util.*;

public class UserInput {

    public static void main(String[] args) {

        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();

        int solvedProblems = sc.nextInt();

        double assessmentPercentage = sc.nextDouble();

        System.out.println("Learner: " + firstName);

        System.out.println("Problems solved: " + solvedProblems);

        System.out.println("Assessment: " + assessmentPercentage);
    }
}
