package Circular_linked_list;


public class CircularLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void create_Circular_link_list(int value) {
        Node node = new Node();
        node.value = value;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }

    public void insert_value_in_circluar_link_list(int value, int location) {
        if (location < 0) {
            System.out.println("Invalid location");
            return;
        }
        Node node = new Node();
        node.value = value;
        if (head == null) {
            create_Circular_link_list(value);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            node.next = head;
            tail = node;
        } else {
            Node tempnode = head;
            for (int i = 0; i < location - 1; i++) {
                tempnode = tempnode.next;
            }
            node.next = tempnode.next;
            tempnode.next = node;
        }
        size++;
    }

    public void delete_element(int location) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (location == 0) { // Delete head
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else if (location >= size - 1) { // Delete tail
            Node tempnode = head;
            for (int i = 0; i < size - 2; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = head;
            tail = tempnode;
        } else { // Delete from middle
            Node tempnode = head;
            for (int i = 0; i < location - 1; i++) {
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
        }
        size--;
    }

    public void print_linked_list() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}
