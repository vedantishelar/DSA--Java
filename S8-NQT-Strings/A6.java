// Consecutive Duplicate Cleaner & Palindrome Validator

// A digital forensics team is analyzing chat logs from a compromised server.
// Each log is stored as a single string containing lowercase letters only.
// Due to a malware glitch, some characters in the string got duplicated consecutively (only duplicates, not random inserts).
// Your task is to clean the log by removing consecutive duplicate characters and return the corrected string.
// However, if after removing duplicates, the string becomes a palindrome, print:
// SECURE
// Otherwise, print the cleaned string.

import java.util.*;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                clean.append(str.charAt(i));
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
            System.out.println("SECURE");
        } else {
            System.out.println(clean.toString());
        }
    }
}
