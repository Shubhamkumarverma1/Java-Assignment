import java.util.*;

public class Palindrome {
    // Method to reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept string input from the user
        System.out.print("Enter a word to check if it's a palindrome: ");
        String userInput = scanner.nextLine();
        // Convert the input to lowercase to make the palindrome check case-insensitive
        String processedInput = userInput.toLowerCase().replaceAll("\\s+", "");
        // Check if the input is a palindrome
        if (isPalindrome(processedInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }
        scanner.close();
    }
}
