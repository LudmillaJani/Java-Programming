

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
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
    /* Print the circle info */
    public void printRectangle() {
        System.out.println("Rectangle with height: " + height + " and width: " + width);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
