import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int value = Main.sum(n);
            System.out.print(value);
        } else {
            System.out.println("Enter a natural number");
        }
    }

    /**
     * Adds the sum of natural numbers starting from 1 to n.
     */
    public static int sum(int n){
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
