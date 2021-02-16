package homework.lesson3;
import homework.lesson2.Circle;
import homework.lesson2.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PointsList points = new PointsList();

        while (sc.hasNextInt()) {
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        sc.next();

        System.out.println("Input coordinates of center and radius:");

        Circle circle = new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextInt());

        for(int i = 0; i < points.len; i++){
            if (circle.containsPoint(points.get(i))) {
                System.out.println(points.get(i).getX() + " " + points.get(i).getY());
            }
        }

        sc.close();
    }
}
