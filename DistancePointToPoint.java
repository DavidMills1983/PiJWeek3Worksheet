import java.util.Scanner;

class Point {
    double x;
    double y;
}

public class DistancePointToPoint {
    public static void main(String[] args) {

        Point points1 = new Point();
        Point points2 = new Point();
        Point points3 = new Point();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X and Y co-ordinates for point 1: ");

        points1.x = sc.nextDouble();
        points1.y = sc.nextDouble();

        System.out.println("Enter X and Y co-ordinates for point 2: ");

        points2.x = sc.nextDouble();
        points2.y = sc.nextDouble();

        System.out.println("Enter X and Y co-ordinates for point 3: ");

        points3.x = sc.nextDouble();
        points3.y = sc.nextDouble();

        sc.close();

        double points1and2Distance = distance(points1.x, points1.y, points2.x, points2.y);
        double points1and3Distance = distance(points1.x, points1.y, points3.x, points3.y);
        double points2and3Distance = distance(points2.x, points2.y, points3.x, points3.y);

        double min = Math.min(points1and2Distance, Math.min(points1and3Distance, points2and3Distance));

        if (min == points1and2Distance) {
            System.out.println("Points 1 and 2 are nearest.");
        } else if (min == points1and3Distance) {
            System.out.println("Points 1 and 3 are nearest.");
        } else {
            System.out.println("Points 2 and 3 are nearest.");
        }

    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }


}
