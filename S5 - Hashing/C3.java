// Check if frequency of all characters in string 1 <= frequency in string 2

import java.util.*;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        boolean match = true;

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char ch = entry.getKey();
            int count1 = entry.getValue();
            int count2 = map2.getOrDefault(ch, 0);

            if (count1 > count2) {
                match = false;
                break;
            }
        }

        System.out.println(match);
    }
}