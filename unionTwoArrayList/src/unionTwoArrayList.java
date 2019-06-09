/* Write a method that returns the union of two array lists of integers. For example, the addition of two array lists
{2, 3, 1, 5} and {3, 4, 6} is {2, ,3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists, each with five integers,
and displays their union. The numbers are separated by exactly one space.

 */
import java.util.ArrayList;
import java.util.Scanner;
public class unionTwoArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //////LIST1
        System.out.print("Enter list1(input ends with 0): ");
        input(list1);

        /////LIST2
        System.out.print("\nEnter list2(input ends with 0): ");
        input(list2);

        ////UNION
        System.out.println("\nUnion: " + union(list1,list2));

    }


    public static void input(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);

        int value1;
        do{
            value1 = input.nextInt();//read a value from the input
            if(value1 != 0)
                list.add(value1);
        }while(value1 != 0);

        System.out.print("You entered: ");
        for(int i = 0; i< list.size(); i++)
            System.out.print(list.get(i) + " ");
    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i: list1)
            list.add(i);
        for(int i: list2)
            list.add(i);

        return list;

    }
}
