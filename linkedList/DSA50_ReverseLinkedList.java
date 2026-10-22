package LinkedList;

import java.util.Scanner;

public class DSA50_ReverseLinkedList {
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
    static Node reversedLinkedList(Node head)
    {
        Node current = head;
        Node prev = null;
        Node next;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of list:");
        int n = sc.nextInt();
        if(n <0)
        {
            System.out.println("Invalid size");
        }
        else{
            System.out.println("Enter node data:");
            Node head = null;
            Node tail = null;
            for(int i = 0 ; i < n ; i++)
            {
                Node current = new Node(sc.nextInt());
                if(head == null)
                {
                    head = current;
                    tail = current;
                }
                else{
                    tail.next= current;
                    tail = tail.next;
                }

            }
            System.out.println("Original list:");
            display(head);
            System.out.println("Reversed list:");
            head = reversedLinkedList(head);
            display(head);
        }
        sc.close();
    }
    
}
