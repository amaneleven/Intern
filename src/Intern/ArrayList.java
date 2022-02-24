package Intern;
import java.util.*;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List li= new java.util.ArrayList();
        li.add(100);
        li.add(200);
        li.add(300);
        li.add(400);
        li.add(800);
        li.add(500);

        System.out.println(li);
        li.remove(4);
        System.out.println(li);
    }
}
