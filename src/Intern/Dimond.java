package Intern;
import java.util.*;

public class Dimond {
    public static void main(String[] args) {
        int n, i, j, extraspace = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        extraspace = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= extraspace; i++)
            {
                System.out.print(" ");
            }
            extraspace--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        extraspace = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= extraspace; i++)
            {
                System.out.print(" ");
            }
            extraspace++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
