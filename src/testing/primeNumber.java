package src.testing;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        //Conditions:
        //1. 0 and 1 are not hte prime number.
        //2. 2 is the first prime number.
        //3. Number should be divisible to any of the other number.
        //4. If number should not be divisible by 2.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int m=n/2;
        boolean flag=true;
        if(n==0 || n==1){
            System.out.println(n +" is not the prime number.");
        }
        else{
            for (int i=2; i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(n+ " is a prime number");
            }

        }
    }
}
