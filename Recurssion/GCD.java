//To find GCD of any 2 numbers
class GCD{
    public static void main(String[] args) {
        GCD gcd= new GCD();
        var result=gcd.gcd(14,7);
        System.out.println(result);
    }
    public int gcd(int a,int b){
        if(b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);


    }
}