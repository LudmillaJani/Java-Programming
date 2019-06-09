/* Algebra: add two matrices
Write a method to add two matrices. In order to be added, the two matrices must have the same or compatible types of
 elements. Let c be the resulting matrix. Each element c_ij is a_ij + b_ij.
Write a test program that prompts the user to enter two 2 * 2 matrices and displays their sum.

 */
import java.util.Scanner;
public class addTwoMatreces {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 2x2 matrix: ");
        double[][] enterMatrix1 = new double[2][2];
        for(int i = 0; i< enterMatrix1.length; i++ )
            for(int j = 0;j<enterMatrix1[i].length;j++)
                enterMatrix1[i][j] = input.nextDouble();

        System.out.print("Enter a 2x2 matrix: ");
        double[][] enterMatrix2 = new double[2][2];
        for(int i = 0; i< enterMatrix2.length; i++ )
            for(int j = 0;j<enterMatrix2[i].length;j++)
                enterMatrix2[i][j] = input.nextDouble();

        double[][] bothMatreces =  addMatrix(enterMatrix1, enterMatrix2);


        for (int i = 0; i < enterMatrix1.length; i++)
        {   //output the first matrix
            for (int j = 0; j < enterMatrix1[i].length; j++)
            {
                System.out.printf("%1.1f ", enterMatrix1[i][j]);
                if (i == 1 && j == 1)
                    System.out.printf("%2s ", " + ");
                else System.out.printf("%3s ", " ");
            }

            for (int j = 0; j < enterMatrix2[i].length; j++)
            {
                //output the second matrix
                System.out.printf("%2.1f ", enterMatrix2[i][j]);
                if (i == 1 && j == 1)
                   System.out.printf("%2s ", " = ");
                else System.out.printf("%3s ", " ");
            }
            for (int k = 0; k < bothMatreces[i].length; k++) {
                System.out.printf("%-7.1f ", bothMatreces[i][k]);
            }
            System.out.println("");
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b)
    {

        double[][] addTogether = new double[a.length][a[0].length];

        for(int i = 0; i < a.length; i ++)
        {
            for(int j = 0; j< a[0].length; j++)
            {
                addTogether[i][j] = a[i][j] + b[i][j];
            }
        }
                return addTogether;
    }
}
