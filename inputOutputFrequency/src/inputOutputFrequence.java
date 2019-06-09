import java.io.*;
import java.lang.*;
import java.util.*;
public class inputOutputFrequence {
    public static void main(String[] args) throws Exception {

        try{
            //reading data using scanner
            Scanner input2 = new Scanner(new File("numbers.txt"));//create the scanner for for numbers.txt
            ArrayList<Integer> listI = new ArrayList<>();//create an array of type ArrayList
            while(input2.hasNext())//while there are still data in the file
                listI.add(input2.nextInt());//add the elements in the array

            System.out.println(listI);//print the array
            //System.out.println(listI.size());//print the size of the array
            frequency(listI);//call the frequency method
            input2.close();//close the file
        }
        catch(IOException ex) {
            System.out.println("I/O errors: no such file.");
        }
        catch(NoSuchMethodException ex){
            System.out.println("No more numbers to read");
        }



    }


    public static void frequency(ArrayList<Integer> array1)throws Exception{
        Set<Integer> unique = new HashSet<>(array1);//do not repeat the same values//output the frequency of each number just once
        ///output in a file
        PrintWriter output = new PrintWriter("outputFrequency.txt");
        output.println("Rate     Frequency ");
        for(int e : unique){
            output.printf("%d%s %10d\n",e , ":", Collections.frequency(array1,e));
        }
        output.close();
    }
}
