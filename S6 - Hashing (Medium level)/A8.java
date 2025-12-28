// Find minimum window in string that contains all characters of another string.

import java.util.*;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int required = need.size();

        int left = 0;
        int formed = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && 
                window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && 
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
