package src.dec30;

import java.util.Scanner;

public class lab006 {
    //swap the number with using any extra variable
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a= sc.nextInt();

        System.out.println("Enter second value: ");
        int b= sc.nextInt();
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of first changed to : " +a);
        System.out.println("Value of second changed to: "+b);

        sc.close();

    }
}
