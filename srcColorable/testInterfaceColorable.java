/* Design an interface named Colorable with a void method named howToColor(). Every class of a colorable object must
implement the colorable interface. Design a class named Square that extends GeometricObject and implements Colorable.
Implement hoeToColor to display the message Color all four sides. The Square class contains a private a private data
field side with getter and setter methods, and a constructor for constructing a Square aith a specific side.
 */
public class testInterfaceColorable {
    public static void main(String[] args){
        GeometricObject square1 = new Square(3);
        ((Square) square1).Colorable();

    }
}

class Square extends GeometricObject implements Colorable{

    private int side;
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void Colorable() {
        System.out.println("Color all four sides");
    }
}