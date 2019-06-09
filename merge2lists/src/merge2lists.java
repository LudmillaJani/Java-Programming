/* Merge two sorted lists
Write the following method that merges two sorted lists into a new sorted list:
Implement the method in a way that takes at most list1.length + list2.length
comparisons. Write a test program that prompts the user to enter two sorted lists and displays
the merged list. Note the first number in the input indicates the number of the elements in the list.
The number is not part of the list.
 */
import java.util.Scanner;

public class merge2lists {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter list1 size and contents:");
        int size1= input.nextInt();
        int[] firstList = new int[size1];

        for(int i = 0; i < size1; i++)
        {
            firstList[i]=input.nextInt();
        }

        System.out.print("Please enter list2 size and contents:");
        int size2= input.nextInt();
        int[] secondList = new int[size2];
        for(int i = 0; i < size2; i++)
        {
            secondList[i]=input.nextInt();
        }

        printArray( merge(firstList,secondList));

    }
    public static int[] merge(int[] list1, int[] list2)
    {
        int newSize = list1.length + list2.length;
        int[] finalList = new int[newSize];

        int j = 0, k = 0, l = 0;
        int max = Math.max(list1.length, list2.length);

        for(int i = 0; i< max; i++)
        {
            if (j < list1.length)
                finalList[l++] = list1[j++];
            if(k < list2.length)
                finalList[l++] = list2[k++];
        }
        java.util.Arrays.sort(finalList);
        return finalList;
    }

    public static void printArray(int[] pArray)
    {
        for(int e: pArray)
            System.out.print(e + " ");
    }


}
