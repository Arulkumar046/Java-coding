import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.*;
class LinkedHashSet1
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> evenNum = new ArrayList<>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        evenNum.add(8);
        System.out.println("ArrayList: " + evenNum);
        LinkedHashSet<Integer> num= new LinkedHashSet<>(evenNum);
        System.out.println("LinkedHashSet: " + num);
    }
}

