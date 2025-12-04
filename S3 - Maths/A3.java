// Check palindrome

import java.util.*;
public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {
        str = str.toLowerCase();

        String original = str;

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length -1;
        while (left < right ) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }

        String reversed = new String (arr);

        if (original.equals(reversed)) {
            return "true";
        } else {
            return "false";
        }
        
    }
}