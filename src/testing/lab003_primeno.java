package src.testing;
import java.util.Scanner;

public class lab003_primeno {

    //Conditions:
    //1. 0 and 1 are not hte prime number.
    //2. 2 is the first prime number.
    //3. Number should be divisible to any of the other number.
    //4. If number should not be divisible by 2.

    public static void main(String[] args) {
        int flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num= sc.nextInt();
        int m= num/2;
        if(num==0 || num==1){
            System.out.println("Above mentioned no is 0 or 1 which is not a prime no.");
        }
        else{
            for(int i=2;i<=m;i++){
                if(num%i==0){
                    System.out.println("Above mentioned no is not a prime no.");
                    flag= 1;
                    break;
                }
            } if(flag==0){
                System.out.println("Above mentioned no is a prime no");
            }
        }
        sc.close();
    }
}
