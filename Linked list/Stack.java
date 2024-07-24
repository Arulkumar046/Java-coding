import java.util.Scanner;

public class Stack {
    Node head;


    class Node
    {
        int data;
        Node next;
       

        Node(int val)
        {
            data = val;
            next = null;
            
        }
    }
    Stack()
    {
        head = null;
    }
   
    public void insertend(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
   
    public void delend(int n)
    {
     Node temp = head;
     Node prev = null;
     for(int i=1;i<n;i++)
     {
      prev=temp;  
      temp=temp.next;
     }
     prev.next=null;   
    }
    public void peak()
    {
       if(head == null)
       {
        System.out.print("Stack is empty");
       }
       else
       {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        System.out.print(" Peak Element is: "+temp.data);
    }
       
}
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack list = new Stack();
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        System.out.println("Enter  values");
        for(int i=0;i<n;i++)
        {
            int val = s.nextInt();
            list.insertend(val);
        }
        list.display();
        list.delend(n);
        list.display();
        list.peak();
       
}      
}
