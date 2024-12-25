class Problem2{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};//O(n)
        
        for(int i=0;i<arr.length;i++){//O(n)
            for(int j=i;j<arr.length;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }

    }
}