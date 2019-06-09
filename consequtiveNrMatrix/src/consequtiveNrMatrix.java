/* Pattern recognition: four consecutive equal numbers
Write the following method that tests whether a two-dimensional array has four consecutive numbers of the same value,
either horizontally, vertically, or diagonally:
public static boolean isConsecutiveFour(int[][] values)
Write a test program that prompts the user to enter the number of rows and columns of two-dimensional array then the
values in the array, nd displays true if the array contains four consecutive numbers with the same value. Otherwise, the program
displays false.


 */
import java.util.Scanner;
public class consequtiveNrMatrix {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);//create scanner to read users input
        System.out.print("Number of rows: ");//prompts user to enter number of rows
        int rows = input.nextInt();
        System.out.print("Number of columns: ");//prompts user to enter number of columns
        int columns = input.nextInt();
        int [][] matrix = new int[rows][columns];//declare a matrix

        System.out.println("Enter matrix values: ");//the matrix will be filled in with users inputs
        for(int i = 0; i< matrix.length; i++)
            for(int j =0; j < matrix[i].length;j++)
                matrix[i][j] = input.nextInt();

        System.out.println(isConsecutiveFour(matrix));//output true if there are 4 consequtive numbers, otherwise output false

    }

    public static boolean isConsecutiveFour(int[][] values)
    {
        // checking rows
        for (int i = 0; i < values.length; i++)
        {                                           //for every row
            int sameCount = 0;                      // variable to store the count of consecutive same numbers
            int position = values[i][0];                //values of each row will be compared first with the first value of each row
            for (int j = 0; j < values[i].length; j++)
            {                                        //step through every element of the row
                if (values[i][j] == position)
                {
                    sameCount++;
                    if (sameCount == 4)
                        return true;
                } else
                    {
                        position = values[i][j];            //if the next value is not the same with the first value of the row, update "position"
                    sameCount = 1;                   //also, start the count from the beginning
                    }
            }
        }

        // check columns
        for (int j = 0; j < values[0].length; j++) { //for every column
            int position = values[0][j];
            int sameCount = 0;
            for (int i = 0; i < values.length; i++) {//step through the rows
                if (values[i][j] == position) {
                    sameCount++;
                    if (sameCount == 4)
                        return true;
                } else {
                    position = values[i][j]; //if the next value is not the same with the first value of the row, update "position"
                    sameCount = 1;           //also, start the count from the beginning
                }
            }
        }

        // check diagonally: going upright
        for (int i = values.length - 1; i > 0; i--) {//from the last row go through every row
            int j = 0;//the first column index
            int sameCount = 0;
            int position = values[i][j];//last row, first column
            while (i >= 0) {
                if (values[i][j] == position) {//if encounter same value with the previous one
                    sameCount++;               //increment the count
                    if (sameCount == 4) return true;
                } else {                        //if not
                    sameCount = 1;              //start the checking and incrementing from the beginning
                    position = values[i][j];
                }
                j++;//increment index of column
                i--;//decrement index of row
            }
        }


        // check diagonally: every time start from the last row but incremented column
        for (int j = 0; j < values[0].length; j++) {//until column index is less then the number of columns
            int i = values.length - 1;
            int sameCount = 0;
            int position = values[i][j];//start from last row, last column
            while (j < values[0].length && i >= 0) {
                if (values[i][j] == position) {
                    sameCount++;
                    if (sameCount == 4) return true;
                } else {
                    sameCount = 1;
                    position = values[i][j];
                }
                j++;
                i--;
            }
        }

        // check diagonally: every time start from the last row but decremented column
        for (int j = values[0].length - 1; j > 0; j--) {
            int i = values.length - 1;
            int position = values[i][j];
            int consecutiveCount = 0;
            while (j >= 0 && i >= 0) {
                if (values[i][j] == position) {
                    consecutiveCount++;
                    if (consecutiveCount == 4)
                        return true;
                } else {
                    consecutiveCount = 1;
                    position = values[i][j];
                }
                j--;
                i--;
            }
        }

        // check diagonally:every time start from the last column but incremented column
        for (int i = 0 ; i < values.length; i++) { //go through every row until row index is less then nr of rows
            int j = values[0].length - 1;// column index
            int position = values[i][j];//we'll start from first row, last column
            int consecutive = 0;
            while (i >= 0) {
                if (values[i][j] == position) {//if consecutive numbers
                    consecutive++;
                    if (consecutive == 4) return true;
                } else { //if not, start the checking from the beginning
                    consecutive = 1;
                    position = values[i][j];
                }
                j--;
                i--;
            }
        }
        return false;
    }
}

