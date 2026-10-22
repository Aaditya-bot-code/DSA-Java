package LinkedList;

import java.util.Scanner;

public class DSA49_DeleteAtPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println("null");
    }
    static Node deleteAtPosition(Node head , int position)
    {
        if(head == null)
        {
            return null;
        }
        if(position == 0)
        {
            head = head.next;
        }
        else{ 
            Node temp= head;
            for(int i = 0 ;  temp != null && i < position - 1 ; i++)
            {
                temp = temp.next;
            }
            if( temp != null && temp.next != null)
            {
                temp.next = temp.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original list:");
        display(head);

        System.out.println("enter position to delete (0-based): ");
        int position = sc.nextInt();
        if(position < 0)
        {
            System.out.println("Invalid position !");
        }
        else{
            head= deleteAtPosition(head,position);
            System.out.println("Updated list:");
            display(head);

        }
        sc.close();

        
    }
   
}
