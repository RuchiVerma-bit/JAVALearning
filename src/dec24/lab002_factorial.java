package src.dec24;

import java.util.Scanner;

public class lab002_factorial {
    public static void main(String[] args) {
        //factorial

        long fact= 1L;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num= sc.nextInt();
        for(int i=1; i<=num;i++){
            fact = fact * i;
        }
        System.out.println("factorial of above no : "+fact);
    }

}
