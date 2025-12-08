// Find element with maximun frequency in array

import java.util.*;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int element = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                element = entry.getKey();
            }
        }

        System.out.println(element);
    }
}