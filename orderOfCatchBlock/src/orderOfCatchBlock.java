import java.lang.*;
public class orderOfCatchBlock {
    public static void main(String[] str){

        try
        {
            ExceptionA exA = new ExceptionA();
            exA.setExceptionA(5,0);
            int div1 = exA.getDivide();
            System.out.println("Division of two numbers is: " + div1);

            ExceptionB exB = null;
            exB.setExceptionB(2,3,4);
            int div2 = exB.getDivide();
            System.out.println("Division of three numbers is: " + div2);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException n)
        {
            System.out.println(n);
        }
        catch(Exception exc)
        {
            System.out.println(exc);
        }
    }
}

class ExceptionA{
    int x,y;
    void setExceptionA(int x, int y){
        this.x=x;
        this.y=y;
    }

    int getDivide(){

        return(x/y);
    }
    ExceptionA(){};
    public ExceptionA(int x, int y){
        this.x = x;
        if(y==0)
        {
            System.out.print("Cant divide by zero.");
            System.exit(1);
        }
        this.y = y;
    }
}

class ExceptionB extends ExceptionA{
    int x,y,z;
    void setExceptionB(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z=z;
    }

    int getDivide(){

        return(super.getDivide() / z);
    }

    public ExceptionB( int x, int y, int z){
        super(x,y);
        if(z==0){
            System.out.print("Cant divide by zero");
            System.exit(1);
        }
        this.z = z;

    }

}
