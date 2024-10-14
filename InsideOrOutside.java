import java.util.Scanner;

class Point {
    double x;
    double y;
}
class Rectangle {
    Point upLeft;
    Point downRight;
    Point middle;

    public Rectangle() {
        upLeft = new Point();
        downRight = new Point();
        middle = new Point();
    }
}

public class InsideOrOutside {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();


        System.out.println("Enter first pair of co-ordinates: ");
        Scanner x_and_y = new Scanner(System.in);
        r1.upLeft.x = x_and_y.nextDouble();
        r1.upLeft.y = x_and_y.nextDouble();

        System.out.println("Enter second pair of co-ordinates: ");
        r2.downRight.x = x_and_y.nextDouble();
        r2.downRight.y = x_and_y.nextDouble();

        System.out.println("Enter third pair of co-ordinates: ");
        r3.middle.x = x_and_y.nextDouble();
        r3.middle.y = x_and_y.nextDouble();

        if (r3.middle.x < Math.max(r1.upLeft.x, r2.downRight.x) && r3.middle.x > Math.min(r1.upLeft.x, r2.downRight.x)){
            if (r3.middle.y < Math.max(r1.upLeft.y, r2.downRight.y) && r3.middle.y > Math.min(r1.upLeft.y, r2.downRight.y)){
                System.out.println("The third pair falls inside the rectangle.");
            }

        } else {
            System.out.println("The third pair falls outside the rectangle.");
        }
    }
}
