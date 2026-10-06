
import java.util.Scanner;

class StudentResult {

    void showTitle() {

        System.out.println("Student Result");

    }

    void displayName(String name) {

        System.out.println("Name: " + name);

    }

    int getPassingMark() {

        return 40;

    }

    int calculateAverage(int first, int second) {

        int sum=first + second;

        return sum / 2;

    }

}

public class ResultOfStudent {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int first = scanner.nextInt();

        int second =scanner.nextInt();

        StudentResult s = new StudentResult();

        s.showTitle();

        s.displayName(name);

        System.out.println("Passing Mark: " + s.getPassingMark());

        System.out.println("Average: " + s.calculateAverage(first, second));

        scanner.close();

    }
}
