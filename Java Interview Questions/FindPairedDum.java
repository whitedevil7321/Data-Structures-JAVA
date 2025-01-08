import java.util.Scanner;

class PairedSum{
    
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Limit till you want to Explore the Pairs:");
int input=sc.nextInt();

System.out.println("Enter the total Sum you want to Explore the Pairs:");
int Sum=sc.nextInt();


for(int i=0;i<=input;i++){
    for(int j=i;j<=input;j++){
        if(i+j==Sum){
            System.out.println("["+i+"+"+j+"]");
        }

    }
}
}


}