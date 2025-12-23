// Find longest subarray with equal count of three different values.

import java.util.*;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        int maxLen = 0;

        map.put("0#0", -1);

        for (int i = 0; i < arr.length; i++) {
            int val = Integer.parseInt(arr[i]);

            if (val == 0)
                count0++;
            else if (val == 1)
                count1++;
            else if (val == 2)
                count2++;

            int diff10 = count1 - count0;
            int diff21 = count2 - count1;

            String key = diff10 + "#" + diff21;

            if (map.containsKey(key)) {
                int prevIndex = map.get(key);
                int length = i - prevIndex;
                maxLen = Math.max(maxLen, length);
            } else {
                map.put(key, i);
            }
        }

        System.out.println(maxLen);
    }
}
