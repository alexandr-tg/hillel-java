package homework.lesson2;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt((Math.pow((this.x - p.getX()), 2) + Math.pow(this.y - p.getY(), 2)));
    }

}
