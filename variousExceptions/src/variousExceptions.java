import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.*;
public class variousExceptions {
    public static void main(String[] str)throws Exception{
        int x = 2;
        int y = 0;
        String str1 = null;

        File fileRead = new File("test.txt");
        fileRead.mkdirs();
        System.out.print("Does the file exists: " + fileRead.exists());


        try {
            Scanner file = new Scanner(Paths.get("exc.txt"));

            if (!fileRead.exists()) {
                throw new IOException();
            }
            if (x == 0)
                throw new ExceptionB("Exception B");
            if (y == 5)
                throw new ExceptionA("Exception A");
            if (str1 == null)
                throw new NullPointerException();
        }
        catch(ExceptionB ex){ }
        catch(ExceptionA ex){ }
        catch(NullPointerException ex){
        }
        catch(IOException ex){
            System.out.println("I/O errors: No such file");
        }


    }

}

class ExceptionA extends Exception{
    private String message;

    public ExceptionA(String msg){
        message=msg;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}



class ExceptionB extends ExceptionA {

    public ExceptionB(String msg) {
        super(msg);
    }
}
