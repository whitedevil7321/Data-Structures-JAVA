class Main{
    public static void main(String[] args) {
        BinaryHeap BH=new BinaryHeap(5);
        BH.peek();
        BH.SizeofBP();
        BH.insert(10,"min");
        BH.insert(5,"min");
        BH.insert(15,"min");
        BH.insert(1,"min");
        BH.levelOrderTraversal();



        // BH.insert(10,"max");
        // BH.insert(5,"max");
        // BH.insert(15,"max");
        // BH.insert(1,"max");
        // BH.levelOrderTraversal();
    }
}