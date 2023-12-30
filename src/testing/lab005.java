package src.testing;
import java.util.Scanner;

public class lab005 {
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= user_input.next();

        System.out.println("Enter your Age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary= user_input.nextDouble();

        System.out.println("Employee details are: "+"Name: " +name+ " Age: "+ age + " Salary: "+salary);

        user_input.close();

    }
}
