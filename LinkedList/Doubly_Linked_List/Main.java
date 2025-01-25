public class Main{
    public static void main(String[] args){
      DoublyLinkList dllist = new DoublyLinkList();
      dllist.CreatNode(10);
      System.out.println(dllist.head.value);
      System.out.println(dllist.head.next);
      System.out.println(dllist.head.prev);
      dllist.InsetNode(20, 0);
      System.out.println(dllist.head.value);
      dllist.print();
    }
}