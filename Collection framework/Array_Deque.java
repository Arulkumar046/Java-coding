import java.util.ArrayDeque;
import java.util.*;
class Array_Deque 
{
    public static void main(String[] args)
    {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}