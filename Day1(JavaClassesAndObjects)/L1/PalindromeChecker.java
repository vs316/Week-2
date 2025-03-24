package JavaClassAndObjects;

public class PalindromeChecker {
    String text;

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.text = "madam"; // Example text
        checker.displayResult();
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}