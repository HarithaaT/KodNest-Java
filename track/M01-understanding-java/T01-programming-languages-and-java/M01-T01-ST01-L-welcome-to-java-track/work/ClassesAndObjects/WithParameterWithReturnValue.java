
import java.util.Scanner;

class ValueToGet {

    int getValue(int number) {

        return number;

    }
}

public class WithParameterWithReturnValue {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        ValueToGet n = new ValueToGet();

        int res = n.getValue(number);

        System.out.println(res);

        sc.close();
    }
}
