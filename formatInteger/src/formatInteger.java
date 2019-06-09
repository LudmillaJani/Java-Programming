/* Format an integer:
Write a method to format the integer with the specified width.
The method returns a string for the number with one or more prefix 0s. The size of the string is the width.
For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. If the
number is longer than the width, the method returns the string representation for the number. For example,
format(34,1) returns 34. Write a test program that prompts the user to enter a number and its width, and displays a string
returned by invoking the method format(number, width).

 */
import java.util.Scanner;
public class formatInteger
{
    public static void main(String[] args)
    {
        System.out.print("Please enter the number and the width:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print(format(num1, num2));
    }



    public static String format(int number, int width)
    {

        String nr = number + "";
        if(nr.length() < width)
        {
            for (int  i = width - nr.length(); i > 0; i--)
                nr = 0 + nr;
        }
        return nr;
    }
}
