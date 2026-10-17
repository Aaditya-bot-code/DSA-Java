package LinkedList;
import java.util.*;
// 10->20->30->null 
// Insert : data(example 5)
//  5->10->20->30->null
public class DSA46_InsertAtBeginning {
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
        newNode.next = head;
        head = newNode;
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
