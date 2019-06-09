import java.io.*;
import java.util.*;
public class readFile {

    private Scanner x;//scanner not just to read from keyB, but from the files also

    public void openFile() {
        try {
            x = new Scanner(new File("chinese.txt"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void read() {
        while (x.hasNext()) {

            int a = x.nextInt();
        }
    }


    public void closeFile(){

        x.close();
    }
}
