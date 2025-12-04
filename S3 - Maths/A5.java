// Armstrong Numbers

import java.util.*;

public class A5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n);
        System.out.println(result);
    }

    public static boolean solve(int n) {
        int original = n;
        int sum = 0;

        int power = String.valueOf(n).length(); 

        while (n > 0) {
            int digit = n % 10;  
            sum = sum + (int)Math.pow(digit, power);        
            n = n / 10;         
        }

        if (sum == original) {
            return true;  
        } else {
            return false; 
        }
    }
}