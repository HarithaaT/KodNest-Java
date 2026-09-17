
public class NestedDoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(i + " " + j);
                j++;
            } while (j <= 2);
            i++;
        } while (i <= 3);
    }
}
