package Inheritance;

public class ReverseCaseASCII {
    public static String reverseCase(String input) {
        String result = "";
        for (char ch : input.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "Hello, WoRLd!";
        String output = reverseCase(input);
        System.out.println("Reversed case: " + output);
    }
}