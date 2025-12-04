// Two Sum for given target from the array and return the indices

import java.util.*;

public class A7 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();

        int result = solve(n, target, in);
        System.out.println(result);
    }

    public static int solve(int n, int target, Scanner in) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return 1;
            }

            map.put(arr[i], i);
        }

        return -1;
    }
}