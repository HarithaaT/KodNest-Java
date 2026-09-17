
class TernaryOperator {

    public static void main(String[] args) {
        int mark1 = 60;
        int mark2 = 40;
        int mark3 = 80;
        int mark4 = 90;
        int mark5 = 100;
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = (totalMarks / 500.0) * 100;
        boolean validMarks = mark1 >= 0 && mark1 <= 100 && mark2 >= 0 && mark2 <= 100 && mark3 >= 0 && mark3 <= 100 && mark4 >= 0 && mark4 <= 100 && mark5 >= 0 && mark5 <= 100;

        String res = (validMarks)
                ? percentage >= 75.0 ? "Distinction"
                        : percentage >= 60.0 ? "First Class"
                                : percentage >= 40.0 ? "Pass"
                                        : percentage < 40.0 ? "Fail"
                                                : "InvalidMarks" : "InvalidMarks";
        System.out.println(res);
    }
}
