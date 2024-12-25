class problem1{
    public static void main(String[] args){
   int arr[]={1,3,4,5};//O(1)
int sum=0;//O(1)
int prod=1;//O(1)

   for(int i=0;i<arr.length;i++){//O(n)
        sum+=arr[i];//O(1)
        prod*=arr[i];//O(1)
    }
    System.out.println(sum);//O(1)
    System.out.println(prod);//O(1)
}
}

// Time Complexity: O(n)