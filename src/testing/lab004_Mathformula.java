package src.testing;

import java.util.Scanner;

public class lab004_Mathformula {
    public static void main(String[] args) {

        // cuberoot(x^2+ y^2+|z|
        // A= x^2, B=y^2 C=|z|
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value for x");
        double x= sc.nextDouble();

        System.out.println("enter value for y");
        double y= sc.nextDouble();

        System.out.println("enter value for z");
        double z= sc.nextDouble();

        double result= Math.cbrt(Math.pow(x,2)+ Math.pow(y,2)+Math.abs(z));
        System.out.println("Result is: "+result);

        sc.close();
    }
}
