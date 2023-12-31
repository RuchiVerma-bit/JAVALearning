package src.dec30;
import java.util.Scanner;

public class lab008 {
    public static void main(String[] args) {
        //swap the number without using any extra variable.
        //this is not useful when one of the value is 0.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a= sc.nextInt();

        System.out.println("Enter second value:");
        int b= sc.nextInt();

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("First value changed to : "+a);
        System.out.println("Second value changed to : "+b);

        sc.close();

    }
}
