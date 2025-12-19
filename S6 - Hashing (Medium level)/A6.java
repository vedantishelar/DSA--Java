// Count subarrays with sum divisible by k.

import java.util.*;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            sum = sum + num;

            int rem = sum % k;
            if (rem < 0) {
                rem = rem + k;
            }

            if (map.containsKey(rem)) {
                count = count + map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        System.out.println(count);
    }
}
