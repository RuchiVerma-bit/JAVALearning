package src.testing;

import java.util.Scanner;

public class lab002_factorial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        int a= sc.nextInt();
        int temp = 1;
        for(int i=1;i<=a;i++)
        {
           temp=temp*i;
        }
        System.out.println("Factorial of the provided no. is: "+temp);

    }
}
