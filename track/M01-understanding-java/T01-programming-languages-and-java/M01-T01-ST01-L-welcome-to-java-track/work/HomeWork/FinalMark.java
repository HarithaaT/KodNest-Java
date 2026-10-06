
import java.util.*;

class Student {

    int mark;

    void showFinalMark(int bonus) {

        int finalMark = mark + bonus;

        System.out.println(mark);

        System.out.println(finalMark);

    }

}

public class FinalMark {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.mark = scanner.scanner.nextInt();

        int bonus = scanner.scanner.nextInt();

        student.showFinalMark(bonus);
        scanner.close();

    }
}
