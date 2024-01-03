package src.testing;

import java.util.Scanner;

public class lab007_FibonacciSeries {
    //In fibonacci series, next number is the sum of previous two numbers
    // for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    // The first two numbers of fibonacci series are 0 and 1
    //Logic
    // first no. --> a
    //second no. --> b
    //third no. -->a+b
    //fourth no. -->a+b+b= a+2b
    //fifth no. --> a+b+b+(a+b)= 2a+3b
    static int n1= 0, n2=1, n3=0;
    static int a1= 0, a2=1, a3=0;
    public static void printFibonacci(int count){           //without recursion
        System.out.print(n1 +" " + n2);
        for (int i = 2; i < count; i++) {           //i=2 because two values are already printing
            n3= n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println(" ");
    }
    public static void printFibonacci1(int count){

        if(count>0){
            a3= a1+a2;
            a1=a2;
            a2=a3;
            System.out.print(" "+a3+" ");
            printFibonacci1(count-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of value of fibonacci series");
        int count= sc.nextInt();
        System.out.println("without recursion");
        printFibonacci(count);
        System.out.println("with recursion");
        System.out.print(a1+" "+a2);
        printFibonacci1(count-2);       //count-2 because two values are already printing.

    }
}
