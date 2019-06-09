/* Modify the GeometricObject class to implement the Comparable interface and define a static max method in the GeometricObject class
for finding the larger of two GeometricObject objects. Write a test program that uses the max method to find the larger of two
circles and the larger of two rectangles.
 */
public class GeometricObjectImplementComparable {
    public static void main(String[] args){
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);
        System.out.print("Comparing the two circles: \n");
        circle1.printCircle();
        circle2.printCircle();
        System.out.println("Larger of two circles: " + Circle.max(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(13,4);
        Rectangle rectangle2 = new Rectangle(5,9);
        System.out.print("Comparing the two Rectangles: \n");
        rectangle1.printRectangle();
        rectangle2.printRectangle();
        System.out.println("Larger of two rectangles: " + Rectangle.max(rectangle1,rectangle2));

    }
}
