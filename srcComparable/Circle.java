

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("Circle with radius: " + radius);
    }
    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(getArea() > o.getArea())
            return 1;
        if(getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
