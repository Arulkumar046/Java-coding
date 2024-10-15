import java.util.Stack;
import java.util.*;
class Stack_peek
{
    public static void main(String[] args) 
    {
        Stack<Integer> numbers= new Stack<Integer>();
        numbers.push(20);
        numbers.push(10);
        numbers.push(50);
        numbers.push(70);
        numbers.push(40);
        numbers.push(30);
        numbers.push(80);
        numbers.push(60);
        System.out.println("Initial Stack: " + numbers);

        Integer element = numbers.peek();
        System.out.println("Element at Top: " + element);
    }
}
