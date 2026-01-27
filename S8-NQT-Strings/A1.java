// Secure Message Validator

// A company uses a secure messaging system where every message is sent as a string.
// For security reasons, a message is considered VALID if:
// The message reads the same forward and backward
// Case does not matter
// All non-alphabetic characters are ignored
// Your task is to determine whether the given message is VALID or INVALID.

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder clean = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                clean.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = clean.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

    }
}
