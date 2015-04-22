package task4_Perimeter;

/**
 * Created by julik on 4/23/15.
 */

public class Perimeter {
    public static void main(String[] args) {
        //System.out.println("We are about perimeter calculation. Write triangle, square or circle");
        Circle circle = new Circle(321);
        System.out.println(circle.getPerimeter());
    }
    static interface Shape{
        public double getPerimeter();
    }

    static class Circle implements Shape {
        double r;
        public Circle(double radius) {
            r = radius;
        }

        public double getPerimeter(){
            return 0;
        }
    }
}

