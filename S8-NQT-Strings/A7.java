// Password Compression with Length Validation

// A cybersecurity system encodes passwords before storing them.
// The encoding rule is:
// For every group of consecutive same characters, replace the group with:
// character + count of repetition
// After encoding, if the encoded string length is greater than or equal to the original string length, 
// the system keeps the original string instead.
// Your task is to print the final stored string.

import java.util.*;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder encoded = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(str.charAt(i - 1));
                encoded.append(count);
                count = 1;
            }
        }

        if (encoded.length() >= str.length()) {
            System.out.println(encoded.toString());
        } else {
            System.out.println(str);
        }
    }
}
