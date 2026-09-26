
import java.util.*;

public class ReadFullNameAfterAge {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        scanner.nextLine();

        String name = scanner.nextLine();

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        scanner.close();
    }
}
