// Find length of longest substring without repeating characters using sliding window + hash set.

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}
