package Intern;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,word;
        System.out.println("Enter String that you want to reverse");
        s=sc.nextLine();
        sc.close();
        char s1[]=s.toCharArray();
        for (int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]);
        }
    }
}
