package com.company;

/**
 * Created by julik on 4/18/15.
 */
public class Park {
    public static void main(String[] args)
    {
        String brand = "VAZ";
        String color = "White";
        Car vaz = new Car(brand,"blue", "2110", 20);

        System.out.println(vaz);
        System.out.println(vaz.color);
;
    }
}
