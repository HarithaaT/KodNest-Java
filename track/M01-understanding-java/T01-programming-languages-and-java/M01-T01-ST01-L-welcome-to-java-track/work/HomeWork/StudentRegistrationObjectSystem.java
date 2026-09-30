
import java.util.*;

class Student {

    int id;

    String name;

    double percentage;
}

public class StudentRegistrationObjectSystem {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        Student s2 = new Student();

        s1.id = sc.nextInt();

        sc.nextLine();
        s1.name = sc.nextLine();

        s1.percentage = sc.nextDouble();

        s2.id = sc.nextInt();

        sc.nextLine();

        s2.name = sc.nextLine();

        s2.percentage = sc.nextDouble();

        int regId = sc.nextInt();

        double newPercentage = sc.nextDouble();

        if (regId == s1.id) {

            Student selectedStudent = s1;

            selectedStudent.percentage = newPercentage;

            System.out.println("Selected Student: " + selectedStudent.name);
        } else if (regId == s2.id) {

            Student selectedStudent = s2;

            selectedStudent.percentage = newPercentage;

            System.out.println("Selected Student: " + selectedStudent.name);

        } else {

            System.out.println("Student not found.");

        }

        System.out.println(s1.id + " " + s1.name + " " + s1.percentage + "%");

        System.out.println(s2.id + " - " + s2.name + " " + s2.percentage + "%");

        sc.close();
    }
}
