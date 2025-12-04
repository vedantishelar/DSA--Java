// Count all Digits of a Number     

// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

import java.util.*;

public class Sol4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = solve(n);
        System.out.println(result);
    }

    public static int solve(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
