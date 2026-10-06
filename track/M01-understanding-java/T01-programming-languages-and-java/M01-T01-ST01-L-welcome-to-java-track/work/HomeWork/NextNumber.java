
import java.util.Scanner;

class GetNextNumber {

    int getNextNumber(int number) {

        return number + 1;

    }

}

public class NextNumber {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        GetNextNumber n = new GetNextNumber();

        System.out.println(n.getNextNumber(number));

        scanner.close();
    }
}
