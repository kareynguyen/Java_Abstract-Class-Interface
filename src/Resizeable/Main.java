package Resizeable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(3.0);

        System.out.println("Area pre-resized: ");
        for (Shape element: shapes) {
            System.out.println(element.getArea());
        }

        for (Shape element: shapes) {
            element.resize(random.nextDouble()*100);
        }

        System.out.println("Area after-resized: ");
        for (Shape element: shapes) {
            if (element instanceof Colorable){
                ((Colorable) element).howToColor();
                System.out.println(element.getArea());
            }
        }
    }
}
