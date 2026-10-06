
import java.util.Scanner;

class Rectangle {

    int calculateArea(int length, int breadth) {

        return length * breadth;

    }

}

public class AreaRectangle {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int breadth = scanner.nextInt();

        Rectangle r = new Rectangle();

        int res = r.calculateArea(length, breadth);

        System.out.println("Area: " + res);

        scanner.close();

    }
}
