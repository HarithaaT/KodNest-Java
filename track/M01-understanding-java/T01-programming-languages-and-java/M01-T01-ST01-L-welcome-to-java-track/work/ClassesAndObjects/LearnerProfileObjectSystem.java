
import java.util.*;

class Learner {

    int id;

    String name;

    int javaScore;
}

public class LearnerProfileObjectSystem {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Learner l1 = new Learner();
        Learner l2 = new Learner();

        l1.id = sc.nextInt();
        sc.nextLine();
        l1.name = sc.nextLine();
        l1.javaScore = sc.nextInt();

        l2.id = sc.nextInt();
        sc.nextLine();
        l2.name = sc.nextLine();
        l2.javaScore = sc.nextInt();

        int newScore = sc.nextInt();

        System.out.println("Before Update");
        System.out.println(l1.id + " " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        l1.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " " + l2.javaScore);

        sc.close();
    }
}
