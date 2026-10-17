
package LinkedList;

import java.util.Scanner;

public class DSA48_InsertAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        // Insert at the beginning (index 0)
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;

        // Move to the node just before the target position
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position!");
                return head;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position!");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original list:");
        display(head);

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter position (zero-based): ");
        int position = sc.nextInt();

        if (position < 0) {
            System.out.println("Invalid position!");
        } else {
            head = insertAtPosition(head, value, position);
            System.out.println("Updated list:");
            display(head);
        }

        sc.close();
    }
}
