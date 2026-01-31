// Recursive String Reversal

// The Time Capsule Decoder
// Archaeologists have discovered a digital time capsule containing ancient messages. 
// However, due to an old encryption method, each message is stored in reverse order.
// To decode the message, the system uses a recursive decoding algorithm that processes the message character by character.
// Your task is to help decode the message.
// ⚠️ Rules:
// You must reverse the string using recursion
// No built-in reverse functions are allowed

import java.util.*;

public class A5 {
    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println(reversed);
    }
}
