// Array Intersection using Hashing

import java.util.*;

public class A6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int result = solve(n, m, in);
        System.out.println(result);
    }

    public static int solve(int n, int m, Scanner in) {
        HashSet<Integer> set = new HashSet<>();  
        
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            int num = in.nextInt();
            if (set.contains(num)) {
                count++;
                set.remove(num);
            }
        }
        return count;
    }
}