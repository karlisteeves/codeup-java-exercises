package shapes;

public class Circle {
    private double radius;
    private static int numCreated;

    public Circle(double radius) {
        this.radius = radius;
        numCreated++;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static int getNumCreated() {
        return numCreated;
    }
}