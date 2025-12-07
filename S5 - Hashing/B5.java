// Count distinct elements in an array

import java.util.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map.size());
    }
}