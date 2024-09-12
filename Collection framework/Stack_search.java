import java.util.Stack;
import java.util.*;
class Stack_search 
{
    public static void main(String[] args)
    {
        Stack<String> animals= new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Monkey");
        animals.push("Hyna");
        animals.push("Fox");
        System.out.println("Stack: " + animals);
        
        int position = animals.search("Horse");
        System.out.println("Position of Horse: " + position);
    }
}