// Duplicate Detection using Hashing

import java.util.*;

public class A5 {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean result = solve(n, in);
        System.out.println(result);
    }

    public static boolean solve(int n, Scanner in) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if (set.contains(num)) {
                return true;   
            }
            else {
                set.add(num);
            }
        }

        return false; 
    }
}
