package task4_Perimeter;

/**
 * Created by julik on 4/23/15.
 */
import java.util.Scanner;

public class Perimeter {

    public static final double PI = 3.141596;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String shape = in.next();
        double side = in.nextDouble();
        double perimeter = 0;

        if (shape.equals("circle")) {
            Circle circle = new Circle(side);
            perimeter = circle.getPerimeter();
        } else if (shape.equals("square")) {
            Square square = new Square (side);
            perimeter = square.getPerimeter();
        } else System.out.println("Enter Square or Circle");

        System.out.println("perimeter of " + shape + " with side/radius " + side + " is " + perimeter);
    }

    public static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double getPerimeter() {
            return 2 * PI * radius;
        }
    }

    public static class Square{
        double side;

        Square(double side){
            this.side = side;
        }
        double getPerimeter(){
            return 4 * side;
        }
    }

}

