class Fibonachi{
    public static void main(String[] args) {
        Fibonachi fibo= new Fibonachi();
var rec=fibo.fibo(10);
System.out.println(rec);

    }
    public int fibo(int n){
        if(n<0){
            return -1;

        }
        if(n==1||n==0){
            return 1;
        }
    return n=fibo(n-1)+fibo(n-2);
        

    }

}
