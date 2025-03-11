import java.util.ArrayList;

public class linked_list {
    public Node head;
    public Node tail;
    public int size;

    public static class Node {
        int value;
        Node next;
        Node prev;
    }

    // Create a linked list with a single node
    public void create_Link_Lists(int value) {
        Node node = new Node(); 
        node.value=value; // Fixed object creation
        head = node;
        tail = node;
        size = 1;
    }

    // Insert a new node at the end of the linked list
    public void insert_at_end(int value) {
        if (head == null) {
            create_Link_Lists(value);  // Handle empty list scenario
            return;
        }
        
        Node node = new Node();
        node.value=value;  // Create a new node with value
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    // Traverse and print the linked list
    public void traversal() {
        Node tempnode = head;
        while (tempnode != null) {
            System.out.print(tempnode.value);
            if (tempnode.next != null) {
                System.out.print(" <--> ");
            }
            tempnode = tempnode.next;
        }
        System.out.println();  // Print newline at end
    }


    // Question 1: Write a function to remove the Duplicate nodes from linked list
    ArrayList<Integer> unique_values = new ArrayList<Integer>();
    public void remove_duplicates() {
        Node tempnode = head;
        while (tempnode != null) {
            if (unique_values.contains(tempnode.value)) {
                tempnode.prev.next = tempnode.next;
                tempnode.next.prev = tempnode.prev;
                size--;
            } else {
                unique_values.add(tempnode.value);
            }
            tempnode = tempnode.next;
        }
    }
}