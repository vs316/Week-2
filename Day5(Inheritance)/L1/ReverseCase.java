package Inheritance;

public class ReverseCase {
    public static String reverseCase(String input) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // Check if character is lowercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
            // For non-alphabetic characters, just append as is
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, WoRLd!";
        String output = reverseCase(input);
        System.out.println("Reversed case: " + output);
    }
}