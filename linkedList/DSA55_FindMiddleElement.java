package LinkedList;

import java.util.Scanner;

public class DSA55_FindMiddleElement {
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
    static int findMiddleElement(Node head)
    {
        if(head == null)
        {
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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
        int value = findMiddleElement(head);
        if(head == null)
        {
            System.out.println("Empty list!");
        }
        else{
            System.out.println("Middle element is "+ value);
        }
        sc.close();
    }

}
