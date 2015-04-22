package task2_MaxValue;

/**
 * Created by julik on 4/23/15.
 */
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers to compare them");
        double a = in.nextInt();
        double b = in.nextInt();
        if (a > b) {
            System.out.println(a + " greater than " + b);
        } else if (a < b) {
            System.out.println(b + " greater than " + a);
        } else System.out.println(a + " equal " + b);

    }
}

