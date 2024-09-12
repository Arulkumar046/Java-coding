import java.util.Stack;
import java.util.*;
class Stack_pop
{
    public static void main(String[] args) 
    {
        Stack<Integer> numbers= new Stack<Integer>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(50);
        numbers.push(60);
        numbers.push(70);
        numbers.push(80);
        System.out.println("Initial Stack: " + numbers);

        Integer element = numbers.pop();
        System.out.println("Removed Element: " + element);
    }
}