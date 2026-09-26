
import java.util.*;

public class ReadAndAddTwoNumbers {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();

        System.out.println("Sum:" + (a + b));

        scanner.close();
    }
}
