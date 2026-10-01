
class PrintNumber {

    public int getNumber() {

        return 10;

    }
}

public class NumberUtility {

    public static void main(String[] args) {

        PrintNumber n = new PrintNumber();

        int num = n.getNumber();

        System.out.println(num);
    }
}
