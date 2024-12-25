class Recusssion{
    public static void main(String[] args) {
        Recusssion recurssion= new Recusssion();
var rec=recurssion.factorial(10);
System.out.println(rec);

    }
    public int factorial(int n){
        if(n<0){
            return -1;

        }
        if(n==1||n==0){
            return 1;
        }
    return n=n*factorial(n-1);
        

    }

}
