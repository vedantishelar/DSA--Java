// Check is any permuation of s1 is substring of s2

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c, 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) {
            System.out.println(true);
            return;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i - s1.length());

            map2.put(newChar, map2.getOrDefault(newChar, 0) + 1);

            if (map2.get(oldChar) == 1) {
                map2.remove(oldChar);
            } else {
                map2.put(oldChar, map2.get(oldChar) - 1);
            }

            if (map1.equals(map2)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
