package Circular_linked_list;
public class main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.create_Circular_link_list(5);
        cll.insert_value_in_circluar_link_list(10, 0);
        cll.insert_value_in_circluar_link_list(15, 2);
        cll.insert_value_in_circluar_link_list(20, 1);
        
        cll.print_linked_list();  // Output: 10 -> 5 -> 20 -> 15 -> (head)
        
        cll.delete_element(2);
        cll.print_linked_list();  // Output: 10 -> 5 -> 15 -> (head)
    }
}
