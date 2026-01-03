// Rearrange string so no two adjacent are same, return "" if impossible.

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> keys = new ArrayList<>(map.keySet());

        char maxChar = 0;
        int maxFreq = 0;

        for (int i = 0; i < keys.size(); i++) {
            char ch = keys.get(i);
            if (map.get(ch) > maxFreq) {
                maxFreq = map.get(ch);
                maxChar = ch;
            }
        }

        if (maxFreq > (s.length() + 1) / 2) {
            System.out.println("");
            return;
        }

        char[] ans = new char[s.length()];

        int index = 0;

        for (int i = 0; i < maxFreq; i++) {
            ans[index] = maxChar;
            index += 2;
        }

        map.put(maxChar, 0);

        for (int i = 0; i < keys.size(); i++) {
            char ch = keys.get(i);
            int freq = map.get(ch);

            for (int j = 0; j < freq; j++) {
                if (index >= s.length()) {
                    index = 1;
                }

                ans[index] = ch;
                index += 2;
            }
        }

        System.out.println(new String(ans));
    }
}
