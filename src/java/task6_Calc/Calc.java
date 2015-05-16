package task6_Calc;

import java.util.Scanner;

/**
 * Created by Julik on 24.04.2015.
 */
public class Calc {
    public static void main(String[] args) {
        System.out.println("Our calculator is pretty simple: there are functions plus (+) and minus (-) Enter first variable");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("enter sign");
        String sign = in.next();
        System.out.println("enter next variables");
        double b = in.nextDouble();
        System.out.println(Calc.Addition(a,sign,b));

    }
    private static double Addition(double a, String sign, double b){
       if (sign.equals ("+")){
                return a + b;
        } else //System.out.println("try again with + or - sign");
           if (sign.equals("-")) {
               return a - b;
           } else {
               return 0;
           }
       }
    }
