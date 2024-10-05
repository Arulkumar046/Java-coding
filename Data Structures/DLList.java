class Node 
{
     int data;
     Node prev;
     Node next;
     Node(int data) 
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DLL
     {
     Node head;
     Node tail;
    DLL() {
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty()
          {
        return head == null;
    }
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void deleteFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }
    public void deleteLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class DLList
{
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(3);

        list.display();
        list.deleteFirst();
        list.deleteLast();

        list.display();
    }
}
