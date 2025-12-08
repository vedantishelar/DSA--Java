// Check if array contains all numbers from 1 to N exactly once

import java.util.*;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean isOnce = true;
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i) || map.get(i) != 1) {
                isOnce = false;
                break;
            }
        }

        System.out.println(isOnce);
    }
}
