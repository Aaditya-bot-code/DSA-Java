package LinkedList;

import java.util.Scanner;

public class DSA54_CountNodes {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node insertAtEnd(int data,Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) 
        {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }
    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.println("null");
    }
    static int countNodes(Node head)
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of nodes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i ++)
        {
            System.out.print("enter value : ");
            int data = sc.nextInt();
            head = insertAtEnd(data,head);
        }

        System.out.println("Original list: ");
        display(head);

        System.out.println("Total nodes : "+countNodes(head));
        sc.close();
    }
}
