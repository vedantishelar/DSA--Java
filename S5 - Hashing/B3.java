// Check if there are two distinct indices i and j where nums[]==nums[j] and abs(i-j)<=k

import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt(); 
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (map.containsKey(val)) {
                int prevIndex = map.get(val);
                if (i - prevIndex <= k) {
                    found = true;
                    break;
                }
            }

            map.put(val, i); 
        }

        System.out.println(found);
    }
}
