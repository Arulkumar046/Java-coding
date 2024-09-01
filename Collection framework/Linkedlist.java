import java.util.LinkedList;
import java.util.*;
class Linkedlist 
{
  public static void main(String[] args)
  {
    LinkedList<String> lang = new LinkedList<>();

    lang.add("Python");
    lang.add("Java");
    lang.add("JavaScript");
    System.out.println("LinkedList: " + lang);
    
    String str = lang.get(1);
    System.out.print("Element at index 1: " + str);
  }
}