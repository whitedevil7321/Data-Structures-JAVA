//Problem Is to find the Sum of All digits present in the Number
//example number:15214 sum:13
import java.util.Scanner;

class sumofdigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumofdigits main=new sumofdigits();
        System.out.print("Enter Number:");
        int number=sc.nextInt(); 
        var sumofdigits=main.sumofdigits1(number);
        System.out.println("Sum of Digits is:"+sumofdigits);

    }
        public int sumofdigits1(int n) {
            if(n==0||n<0){
            return 0;

            }
        
        return n%10+sumofdigits1(n/10);
    }

}
