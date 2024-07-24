import java.util.*;
class CLList
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
CLList()
{
    head=null;
}
public void insertpos(int pos,int val2)
    {
     Node newnode = new Node(val2);
     Node temp = head;
     for(int i=1 ;i<pos ;i++)
     {
      temp=temp.next;
     }
     newnode.next=temp.next;
     temp.next = newnode;   
    }
public void insertend(int val) {
            Node newnode=new Node(val);
            if( head==null) {
                newnode.next = newnode;
                head = newnode;
                
            }else {
                newnode.next = head.next;
                head.next = newnode;
                head = newnode;
            }
        }
    public void display()
    {
        Node temp=head.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head.next);
    }
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        CLList list=new CLList();
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=obj.nextInt();
            list.insertend(val);
        }
        list.display();
        System.out.print("\nEnter the element at mid position\n");
        int pos=obj.nextInt();
        int val2=obj.nextInt();
        list.insertpos(pos,val2);
        list.display();
        obj.close();
    }
}
