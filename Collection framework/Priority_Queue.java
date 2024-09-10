import java.util.PriorityQueue;
import java.util.*;
class Priority_Queue 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(8);
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}