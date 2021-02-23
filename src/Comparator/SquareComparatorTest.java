package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square [] squares =  new Square[3];
        squares[0] = new Square(2.0, "blue", false);
        squares[1] = new Square();
        squares[2] = new Square(3.0, "pink", false);

        System.out.println("Pre-sorted: ");
        for (Square square: squares) {
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted: ");
        for (Square square: squares) {
            System.out.println(square);
        }
    }

}
