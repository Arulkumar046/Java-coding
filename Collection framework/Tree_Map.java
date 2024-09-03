import java.util.TreeMap;
import java.util.*;
class Tree_Map {
    public static void main(String[] args) 
    {
        TreeMap<String, Integer> evenNum = new TreeMap<>();
        evenNum.put("Two", 2);
        evenNum.put("Four", 4);
        evenNum.putIfAbsent("Six", 6);
        System.out.println("even numbers: " + evenNum);
        TreeMap<String, Integer> num = new TreeMap<>();
        num.put("One", 1);

        num.putAll(evenNum);
        System.out.println("numbers: " + num);
    }
}
