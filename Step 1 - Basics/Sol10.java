// Print 1 to N using recursion

import java.util.*;

public class Sol10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printNumbers(1, n);
    }

    public static void printNumbers(int current, int n) {
        if (current > n) return;   
        System.out.println(current);

        printNumbers(current + 1, n);  
    }
}
