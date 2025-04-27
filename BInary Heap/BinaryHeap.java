public class BinaryHeap{
    int array[];
    int sizeOfTree;
    public BinaryHeap(int size){

        array=new int[size+1];
        this.sizeOfTree=0;
        System.out.println("Binary Heap Is successfully created");
    }
    public boolean isEmpty(){
        if(sizeOfTree==0){
            return true;
        }
        else{
            return false;
        }
    }
    public Integer peek(){
        
    if(isEmpty()){
            System.out.println("There is Nothing inside the Binary Heap");
            return null;
    }
    else{
        return array[1];

    }


    }

    public int SizeofBP(){
        return sizeOfTree;
    }

    public void levelOrderTraversal(){
        for(int i=1;i<=sizeOfTree;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println("\n");
    }
    void heapifyBottomTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        
        if (heapType.equals("min")) {
            if (array[index] < array[parent]) {
                int temp = array[index];
                array[index] = array[parent];
                array[parent] = temp;
                heapifyBottomTop(parent, heapType);
            }
        } else if (heapType.equals("max")) {
            if (array[index] > array[parent]) {
                int temp = array[index];
                array[index] = array[parent];
                array[parent] = temp;
                heapifyBottomTop(parent, heapType);
            }
        }
    }
    
    void insert(int value, String heapType) {
        array[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomTop(sizeOfTree, heapType);
        System.out.println("Inserted " + value + " successfully in the Heap");
    }
    
}