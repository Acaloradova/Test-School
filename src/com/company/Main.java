package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("My first App!!");

        int test_int;
        test_int = 5;

        System.out.println(test_int);

        String a = "abc";
        String c = "def";
        String s = a + c;

        String str = new String("My first string");

        Double test1 = new Double(2.3);
        System.out.println(test1);

        int arr[];
        arr = new int[10];
        int[] b = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(b[3]);

        boolean[] f = {true, false};
        System.out.println(f[0]);
        System.out.println(Arrays.toString(b));

        max(1,3);
    }

    public static void max(int first, int second) {
        System.out.println("comparing" + first + " and " + second);
        if (first == second) {
            System.out.println("equal");
        }
        if (first > second) {
            System.out.println(first + "is greater");
        } else {
            System.out.println(second + "is greater");
        }

    }

}