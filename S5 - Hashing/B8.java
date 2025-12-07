// Count elements appearing exactly k times in an array

import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int k = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == k) {
                count++;
            }
        }

        System.out.println(count);
    }
}
