
class Robot {

    Robot() {

        System.out.println("Beep beep! Robot reporting for Java duty!");

    }

}

public class DefaultConstructor {

    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Robot r = new Robot();

    }
}
