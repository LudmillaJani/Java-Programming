/* Write a method that returns a new array by eliminating the duplicate values in the array.
Write a test program that reads in 10 integers, invokes the method, and displays the distinct numbers
separated by exactly one space.
 */
import java.util.Scanner;

public class eliminateDuplicates {
    public static void main(String[] args)
    {
        System.out.print("Please enter 10 numbers: ");
        Scanner input = new Scanner(System.in);

        int[] nrArray = new int[10];

        for (int i=0; i < 10; i++)
        {
            nrArray[i]= input.nextInt();
        }

        int[] newArray;
        newArray =  eliminateDuplicates(nrArray).clone();

        System.out.print("Distinct numbers are: ");

        for (int i = 0; i< newArray.length; i++ )
        {
            if(newArray[i] != 0)
                System.out.print(newArray[i] + " ");

        }

    }
    public static int[] eliminateDuplicates(int[] refArray){

        int finalArray[] = new int[refArray.length];
        int j = 0;
        for (int i : refArray) {
            if(!common(finalArray, i))
                finalArray[j++] = i;
        }
        java.util.Arrays.sort(finalArray);

        return finalArray;

    }
    public static boolean common(int[] array, int index){
        for (int i : array) {
            if(i==index)
                return true;
        }
        return false;
    }
}
