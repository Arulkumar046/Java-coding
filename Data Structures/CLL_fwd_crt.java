import java.util.*;
class CLL_fwd_crt
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
CLL_fwd_crt()
{
  head=null;
}
public void java(int val)
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
  CLL_fwd_crt list=new CLL_fwd_crt();
  while(true)
  {
    int val=obj.nextInt();
    if(val==-1)
    break;
    list.java(val);
  }
  list.display();
}
}