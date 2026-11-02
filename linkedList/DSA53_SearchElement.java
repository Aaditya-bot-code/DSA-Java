package LinkedList;

import java.util.Scanner;

public class DSA53_SearchElement {
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
    static int searchElement(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }
        Node temp = head;
        int i = 1;
        while(temp != null)
        {
            if(key == temp.data)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }
    public static void main(String[] args) {
        Node head= null;
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
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        int status = searchElement(head,key);
        if(status == -1)
        {
            System.out.println("Not Found!");
        }
        else{
            System.out.println("Value found at position "+status);
        }
        sc.close();
        
    }
}
