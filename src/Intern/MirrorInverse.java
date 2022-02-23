package Intern;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MirrorInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count=0,i;
        int arr[]=new int[10];
        System.out.println("Enter size of array");
        n= sc.nextInt();
        System.out.println("Enter elements of array");
        for (i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
            if (arr[arr[i]]==1)
            {
                count++;
            }
        }
        if (count!=0)
        {
            System.out.println("The given array is mirror inverse");
        }
        else
        {
            System.out.println("Not a mirror inverse araray");
        }
    }
}
