// Reverse a string without using built-in reverse functions

// The Mirror Message Problem
// In a secret communication system, messages are sometimes transmitted in reverse order to prevent unauthorized access. 
// Before a message can be read, it must be restored to its original form.
// You are given a message as a string S. Your task is to reverse the message so it can be read correctly.
// ⚠️ Due to system restrictions, you are not allowed to use any built-in string reverse functions.

import java.util.*;

public class A3 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length-1;

        while( left < right ) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);
        System.out.println(reversed);

    }
}