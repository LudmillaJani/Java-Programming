/* (Longest common prefix)
Write a program that prompts the user to enter two strings and displays
the largest common prefix of the two strings
 */

import java.util.Scanner;
public class commonPrefix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();



        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        commonP(firstString, secondString);



    }

    public static void commonP(String usersFirstString, String usersSecondString) //method to find if there is a common string
    {
        int length = Math.min(usersFirstString.length(), usersSecondString.length()) ;
        String inCommon = "";

        for (int i = 0; i < length; i++)
        {
            if (usersFirstString.charAt(i) == usersSecondString.charAt(i))
                inCommon = inCommon + usersSecondString.charAt(i);
            else
               break;
        }

        if(inCommon.length() != 0)
            System.out.print("The common prefix is " + inCommon);
        else
            System.out.print(usersFirstString + " and " + usersSecondString + " have no common prefix.");
    }
}
