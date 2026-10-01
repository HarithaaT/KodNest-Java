
import java.util.Scanner;

class Calculator {

    int add(int first, int second) {

        return first + second;

    }

}

public class CreatingCalculator {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        int second = scanner.nextInt();

        Calculator calc = new Calculator();

        int res = calc.add(first, second);

        System.out.println(res);

        scanner.close();
    }

}
