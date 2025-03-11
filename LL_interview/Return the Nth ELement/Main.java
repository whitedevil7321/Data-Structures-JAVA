public class Main{
    public static void main(String[] args) {
        singlyLinkedList sll=new singlyLinkedList();
      
        sll.InsertElement(10, 0);
        sll.InsertElement(20, 1);
        sll.InsertElement(30, 2);
        sll.InsertElement(40, 3);
        sll.InsertElement(50, 4);
        sll.InsertElement(60, 5);
        sll.InsertElement(70, 6);
        sll.InsertElement(80, 7);
        sll.InsertElement(90, 8);
        sll.InsertElement(100, 9);
        sll.InsertElement(110, 10);
        sll.InsertElement(120, 11);
        sll.InsertElement(130, 12);
        sll.InsertElement(140, 13);
        
        sll.Traverse();
        sll.valueofnth(3);
    }
}