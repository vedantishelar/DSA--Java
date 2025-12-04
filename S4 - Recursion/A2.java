// Print N to 1 using recursion

import java.util.*;

public class A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printReverse(n);
    }
    
    static void printReverse(int n) {
        if (n < 1) return;      
        System.out.println(n);  
        printReverse(n - 1);    
    }
}
