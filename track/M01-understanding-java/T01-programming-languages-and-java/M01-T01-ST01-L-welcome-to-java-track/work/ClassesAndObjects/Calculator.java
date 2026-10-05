
import java.util.*;

class CalculatorOperation {

    int add(int first, int second) {

        return first + second;

    }

}

public class Calculator {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();

        int second = scanner.nextInt();

        CalculatorOperation calc = new CalculatorOperation();

        int res = calc.add(first, second);

        System.out.println(res);

        scanner.close();
    }

}
