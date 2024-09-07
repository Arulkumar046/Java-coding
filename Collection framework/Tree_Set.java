import java.util.TreeSet;
import java.util.*;
class Tree_Set 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        Numbers.add(2);
        Numbers.add(4);
        Numbers.add(6);
        Numbers.add(8);
        Numbers.add(10);
        System.out.println("TreeSet: " + Numbers);

        TreeSet<Integer> number = new TreeSet<>();
        number.add(1);
        number.add(3);
        number.add(5);
        number.add(7);
        number.add(9);
        number.addAll(Numbers);
        System.out.println("New TreeSet: " + number);
    }
}
