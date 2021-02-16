package homework.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] points = new int[10][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        System.out.println("Input coordinates of center and radius:");

        Circle circle = new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextInt());

        for(int[] value: points){
            if (circle.containsPoint(new Point(value[0], value[1]))) {
                System.out.println(Arrays.toString(value));
            }
        }

        sc.close();
    }
}