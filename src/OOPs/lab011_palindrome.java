package src.OOPs;

import java.util.Scanner;

public class lab011_palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String user_input= sc.next();
        boolean result= isPalindrome(user_input);
        if(result){
            System.out.println("Provided input is a palindrome");
        }
        else{
            System.out.println("Provided input is not a palindrome");
        }

    }

    private static boolean isPalindrome(String userInput) {
        String original_input= userInput;
        StringBuilder sb= new StringBuilder(userInput);
        String reverse_input= sb.reverse().toString();
        return original_input.equalsIgnoreCase(reverse_input);
    }
}
