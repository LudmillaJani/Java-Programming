import java.io.*;
import java.lang.*;
import java.util.*;

public class createFile {
    private Formatter x;//private or final
    public void openFile(){
        try {
            x = new Formatter("chinese.txt");
        }
        catch (Exception e){
            System.out.println("You have an error");
        }
    }

    public void addRecords(){
        x.format("%s %s %s", "20", "abc", "roberts" );
    }

    public void closeFile(){
        x.close();
    }


}
