
import java.util.Scanner;

class Large {

    int getLarger(int first, int second) {

        if (first < second) {
            return second;
        }

        return first;
    }
}

public class NumberLarger {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        int second = scanner.nextInt();
        Large n = new Large();

        System.out.println(n.getLarger(first, second));

        scanner.close();
    }
}
