// Single number apperaring once in an array where every other number appears twice

import java.util.*;

public class A8 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = solve(n, in);
        System.out.println(result);
    }

    public static int solve(int n, Scanner in) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.iterator().next();
    }
}