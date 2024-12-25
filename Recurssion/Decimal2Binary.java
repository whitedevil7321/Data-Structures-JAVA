//Decimal To Binary USING RECURSION
class Decimal2Binary {
    public static void main(String[] args) {
        Decimal2Binary d2b=new Decimal2Binary();
        var result=d2b.d2b(12);
        System.out.println(result);
        
    }
    public int d2b(int n){
        if(n==0){
            return 0;

        }
        return n%2+10*d2b(n/2);
    }
}
