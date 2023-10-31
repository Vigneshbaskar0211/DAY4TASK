package javatask2;

public class Palindromecheck {

	public static void main(String[] args) {
        String input = "racecar";

        // Remove spaces and convert the input to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
