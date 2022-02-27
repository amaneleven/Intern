package Intern;
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int tos, sos, permutation, f1, f2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n and r: ");
        tos = sc.nextInt();
        sos = sc.nextInt();
        f1 = tos;
        for (int i = tos - 1; i >= 1; i--)
        {
            f1 = f1 * i;
        }
        int number;
        number = tos - sos;
        f2 = number;
        for (int i = number - 1; i >= 1; i--)
        {
            f2 = f2 * i;
        }
        permutation = f1 / f2;
        System.out.println("The permutation of P(n, r) = "+permutation);
    }
}
