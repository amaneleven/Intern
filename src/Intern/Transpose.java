package Intern;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column, i,j;
        System.out.println("Enter rows and columns ");
        row=sc.nextInt();
        column=sc.nextInt();
        int matrix[][] =new int[row][column];
        System.out.println("Enter the items of Matrix");
        for(i=0;i<row;i++)
        {
            for (j=0;j<column;j++)
            {
                matrix[i][j]=sc.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("You created matrix");
        for(i=0;i<row;i++)
        {
            for (j = 0; j < column; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
            System.out.println(" ");
        }

        System.out.println("Transpose of the matrix");
        for(i=0;i<row;i++)
        {
            for (j = 0; j < column; j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
