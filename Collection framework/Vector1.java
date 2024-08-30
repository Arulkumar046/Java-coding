import java.util.Vector;
import java.util.*;
class Vector1 
{
    public static void main(String[] args)
    {
        Vector<String> mammals= new Vector<>();
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
        
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}