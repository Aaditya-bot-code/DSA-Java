package LinkedList;
// 10->20->30->null
// insert : data(example 40)
// 10->20->30->40->null
import java.util.Scanner;

public class DSA47_InsertAtEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        Scanner sc = new Scanner(System.in);

        head.next = second;
        second.next = third;

        Node current = head;
        while(current != null)
        {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");

        System.out.println("Enter node value: ");
        int value = sc.nextInt();

        Node newNode = new Node(value);
        current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        current = head;

        while(current != null)
        {
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");
        sc.close();

        
    }
   
    
}
