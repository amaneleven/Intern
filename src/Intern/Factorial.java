package Intern;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,total=1;
        System.out.println("Enter Range till which factotrial is to be calculated");
        n=sc.nextInt();
        if(n==0)
        {
            System.out.println("CAnnot process 0. Enter value more than 0"); return;
        }
        while(n>0)
        {
            total= total *n;
            n--;
        }
        System.out.println(total);
    }
}
