package dev.omedia.sections.seven;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public double distance() {
        return this.distance(0, 0);
    }

    public double distance(Point point) {
        return this.distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
