package Intern;
import java.util.*;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i, j,flag=0;
        System.out.println("=-=-=-=--=-Enter String to check=-=-=-=--=-");
        s=sc.nextLine();
        StringBuilder ss=new StringBuilder();
        ss.append(s);
        ss.reverse();

        for (i=0;i<s.length()-1;i++)
        {
            if (s.charAt(i)!=ss.charAt(i))
            {
               flag++;
            }
        }
        if(flag>0)
        {
            System.out.println("Not pallindrome");
        }
        else
        {
            System.out.println("Pallindrome");
        }
    }
}
