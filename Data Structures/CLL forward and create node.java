import java.util.*;
class CLL
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
CLL()
{
  head=null;
}
public void sivaraj(int val)
{
  Node newnode=new Node(val);
  if(head==null)
  {
    newnode.next=newnode;
    head=newnode;
  }
  else
  {
    newnode.next=head.next;
    head.next=newnode;
    head=newnode;
  }
}
public void display()
{
  Node temp=head.next;
  do{
    System.out.print(temp.data+" ");
    temp=temp.next;
  }while(temp!=head.next);
}
public static void main(String[]args)
{
  Scanner obj=new Scanner(System.in);
  CLL list=new CLL();
  while(true)
  {
    int val=obj.nextInt();
    if(val==-1)
    break;
    list.sivaraj(val);
  }
  list.display();
}
}