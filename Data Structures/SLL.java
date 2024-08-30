import java.util.*;
class Sll
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
           data=val;
           next=null;
        }
    }
SLL()
{
    head=null;
}
public void insert(int data)
{
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
    }
    else
    {
        newnode.next=head;
        head=newnode;
    }
}
public void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
}
public static void main(String[]args)
{
    Scanner obj=new Scanner(System.in);
    SLL list=new SLL();
    System.out.print("Enter the Values:");
    int num=obj.nextInt();
    for(int i=0;i<num;i+=1)
    {
        int val=obj.nextInt();
        list.insert(val);
    }
    list.display();
}
}
