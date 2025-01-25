package SinglyLinkList;
public class main {
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);
        sll.InsertInTheList(10,0);
        System.out.println(sll.head.value);
        sll.InsertInTheList(10,0);
        sll.InsertInTheList(20,0);
        sll.InsertInTheList(30,0);
        sll.InsertInTheList(40,0);
        sll.InsertInTheList(50,0);
        sll.InsertInTheList(60,0);
        sll.InsertInTheList(70,0);
        sll.delete_element(1);
        sll.print_linked_list();
        sll.print_size();
        sll.search(70);
    }
}
