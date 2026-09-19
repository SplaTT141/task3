package lt.vcd;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter coordinates of upper-left corner");
        System.out.print("x1: ");
        int x1 = in.nextInt();
        System.out.print("y1: ");
        int y1 = in.nextInt();

        System.out.println("Enter coordinates of lower-right corner");
        System.out.print("x2: ");
        int x2 = in.nextInt();
        System.out.print("y2: ");
        int y2 = in.nextInt();

        int a = x2 - x1;
        int b = y1 - y2;

        System.out.println("Area of rectangle is: " + a * b);
        System.out.println("Perimeter of rectangle is: " + (a + b) * 2);
    }
}
