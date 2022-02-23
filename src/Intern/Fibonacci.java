package Intern;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=0,s2=1,s3,n;
        System.out.println("Enter Range upto which you want to print fibonacci number");
        n=sc.nextInt();
        System.out.print(s1+ " " +s2);
        for(int i=2;i<n;i++)
        {
            s3=s1+s2;
            s1=s2;
            s2=s3;

            System.out.print(" " + s3);
        }
    }
}
