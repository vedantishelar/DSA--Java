// Count subarrays with equal number of 0s and 1s

import java.util.*;

public class A5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            int num = Integer.parseInt(arr[i]);

            if (num == 1) {
                sum = sum + 1;
            } else {
                sum = sum - 1;
            }

            if (map.containsKey(sum)) {
                count = count + map.get(sum);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}