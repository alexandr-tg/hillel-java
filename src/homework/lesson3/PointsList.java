package homework.lesson3;

import homework.lesson2.Point;

import java.util.Arrays;

public class PointsList {
    private Point[] points = new Point[4];
    int len = 0;

    public void add(Point p) {
        if(len == points.length) listExpand();
        points[len] = p;
        len++;
    }

    public Point get(int i) {
        checkExistsIndex(i);
        return points[i];
    }

    public void set(int i, Point p) {
        checkExistsIndex(i);
        points[i] = p;
    }

    public void remove(int index) {
        checkExistsIndex(index);
        Point[] buffer = new Point[points.length-1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }

        points = buffer;
    }

    public int size(){
        return points.length;
    }

    private void checkExistsIndex(int index){
        if(index >= points.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void listExpand(){
        points = Arrays.copyOf(points, (int)Math.ceil(points.length*1.5));
    }
}
