
import java.util.Scanner;

class Practice {

    void showTitle() {
        System.out.println("Method Practice");
    }

    void showName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateTotal(int first, int second) {
        return first + second;

    }

}

class PracticeMethod {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int first = scanner.nextInt();

        int second = scanner.nextInt();

        Practice m = new Practice();

        m.showTitle();

        m.showName(name);

        System.out.println("Passing Mark: " + m.getPassingMark());

        System.out.println("Total: " + m.calculateTotal(first, second));

        scanner.close();
    }
}
