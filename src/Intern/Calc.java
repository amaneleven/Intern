package Intern;
import java.util.*;
public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, a, b;

        System.out.println("-=-=-=---=-=-Enter two numbers-=-=-=---=-=-");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("-=-=-=---=-=-Choose operation-=-=-=---=-=-");
        System.out.println("1 . Addition");
        System.out.println("2 . Subtraction");
        System.out.println("3 . Multiplication");
        System.out.println("4 . Division");

        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Choice");
                break;

              
        }
    }
}
