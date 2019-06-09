/* Geometry: n-sided regular polygon
In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e the polygon is
 both equilateral and equiangular).
Design a class named RegularPolygon. Write a test program that creates three RegularPolygon objects, created using
the no-arg constructor. For each object, display its perimeter and area.

 */
//UML DIAGRAM
/*
-n: int
-side: double
-x: double
-y: double
+RegularPolygon(n: int, side: double, x: double, y: double)
+setN(n: int)
+getN(): int
+setSide(side: double)
+getSide():double
+setX(x: double)
+getX(): double
+setY(y: double)
+getY(): double
+getPerimeter(): double
+getArea(): double


 */

public class RegularPolygon {

    public static void main(String[] args){
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);


        System.out.printf("%-10s %-10.2f %-10s %-10.2f \n","Object 1 : Perimeter = " ,  polygon1.getPerimeter() , " Area = " , polygon1.getArea());
        System.out.printf("%-10s %-10.2f %-10s %-10.2f \n","Object 2 : Perimeter = " ,  polygon2.getPerimeter() , " Area = " , polygon2.getArea());
        System.out.printf("%-10s %-10.2f %-10s %-10.2f \n","Object 3 : Perimeter = " ,  polygon3.getPerimeter() , " Area = " , polygon3.getArea());

    }


    private int n;
    private double side;//stores the length of the side
    private double x;//defines the x-coordinate of the polygon's center
    private double y;//defines the y-coordinate of the polygon's center

    //constructors
    public RegularPolygon(){//a no-argument constructor
    n = 3;
    side = 1;
    x=0;
    y=0;
    }
    public RegularPolygon(int n, double side){//constructor
        this.n = n;
        this.side=side;
        this.x = 0;
        this.y = 0;
    }
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }


//getters and setters
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //perimeter of the polygon
    public double getPerimeter(){
        return side *n;
    }

    //area of the polygon
    public double getArea(){
        return(n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }

}
