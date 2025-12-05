// Count total number of contiguous subarrays whose sum equals k

import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt(); 
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum = prefixSum + nums[i];

            int complement = prefixSum - k;
            if (map.containsKey(complement)) {
                count = count + map.get(complement);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}
