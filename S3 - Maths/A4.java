// GCD Or HCF

import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();

        int result = solve(a, b);
        System.out.println(result);
    }

    public static int solve(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}