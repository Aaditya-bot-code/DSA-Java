package LinkedList;

import java.util.Scanner;

/*
 * Problem: Find the Nth node from the end of a singly linked list.
 * Approach: Move the fast pointer N positions ahead, then move fast and slow
 * pointers together until fast reaches null. Slow will then point to the
 * required node.
 *
 * Time Complexity: O(N)  - visits the list at most once.
 * Space Complexity: O(1) - uses only fast and slow pointers.
 *
 * Dry Run:
 * List: 10 -> 20 -> 30 -> 40 -> null
 * Find the 2nd node from the end (N = 2):
 * 1. Move fast two nodes ahead; fast points to 30.
 * 2. Move slow and fast one node together: slow = 20, fast = 40.
 * 3. Move them again: slow = 30, fast = null.
 * 4. Slow now points to the 2nd node from the end.
 * Result: 30
 */
public class DSA56_FindNthNodeFromEnd {
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
    static Node findNthNodeFromEnd(Node head, int n)
    {
        if(head == null || n <= 0)
        {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for(int i = 0 ; i < n ; i++)
        {
            if(fast == null)
            {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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
        System.out.print("Enter the position of the node to find from the end: ");
        int m = sc.nextInt();
        Node nthNode = findNthNodeFromEnd(head,m);
        if(head == null)
        {
            System.out.println("Empty list!");
        }
        else if(m <= 0 || nthNode == null)
        {
            System.out.println("Invalid position!");
        }
        else{
            System.out.println("Nth node from end is "+ nthNode.data);
        }
        sc.close();
    }

}
