import java.util.Scanner;
class Point {
    double x;
    double y;
}
class Rectangle {
    Point upLeft;
    Point downRight;

    public Rectangle() {
        upLeft = new Point();
        downRight = new Point();
    }
}

public class RectangleProgram {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();


        System.out.println("Enter upper left X and Y co-ordinates: ");
        Scanner x_and_y = new Scanner(System.in);
        r1.upLeft.x = x_and_y.nextDouble();
        r1.upLeft.y = x_and_y.nextDouble();

        System.out.println("Enter bottom right X and Y co-ordinates: ");
        r2.downRight.x = x_and_y.nextDouble();
        r2.downRight.y = x_and_y.nextDouble();

        double perimeter = calc_perimeter(Math.abs(r1.upLeft.x - r2.downRight.x), Math.abs(r1.upLeft.y - r2.downRight.y));
        double area = calc_area(Math.abs(r1.upLeft.x - r2.downRight.x), Math.abs(r1.upLeft.y - r2.downRight.y));
        System.out.println("The perimeter is " + perimeter + " and the area is " + area);

    }

    public static double calc_perimeter(double x, double y) {
        return x + x + y + y;
    }
    public static double calc_area(double x, double y) {
        return x * y;
    }

}
