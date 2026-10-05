
import java.util.Scanner;

class Name {

    void displayName(String name) {

        System.out.println("Student: " + name);

    }

}

public class DisplayName {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Name s = new Name();

        s.displayName(name);

        scanner.close();
    }
}
