package src.testing;

import javax.security.auth.login.LoginContext;
import java.util.Scanner;

public class lab008_palindromeNumber {

    //A palindrome number is a number that is same after reverse.
    // For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
    // It can also be a string like LOL, MADAM etc.

    //LOGIC:
    //1. Get the number or String into String to check for palindrome
    //2. Hold the number in temporary variable
    //3. Reverse the number
    //4. Compare the temporary number with reversed number
    //5. If both numbers are same, print "palindrome number"
    //6. Else print "not palindrome number"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.next();

        String y = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            y = y + input.charAt(i);
        }
        System.out.println(y);
        String output=y;
        if (output.equals(input)) {
            System.out.println("Enter input is a palindrome");
        } else {
            System.out.println("Enter input is not a palindrome");
        }
    }
}
