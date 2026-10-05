
class Print {

    public int getNumber() {

        return 10;

    }
}

public class PrintNumber {

    public static void main(String[] args) {

        Print n = new Print();

        int num = n.getNumber();

        System.out.println(num);
    }
}
