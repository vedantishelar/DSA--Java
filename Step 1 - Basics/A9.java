// Check for Prime

import java.util.*;

public class A9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);
    }

    public static boolean solve(int n) {
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;

        for (int i = 2; i < n; i++) {   
            if (n % i == 0) {
                return false;   
            }
        }
        
        return true;
    }
}