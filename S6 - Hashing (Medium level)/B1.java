// Minimum delete ons so all frequencies become unique.

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        HashSet<Integer> uniq = new HashSet<>();
        int deletions = 0;

        for (int i = 0; i < 26; i++) {
            int n = freq[i];

            while (n > 0 && uniq.contains(n)) {
                n--;
                deletions++;
            }

            if (n > 0) {
                uniq.add(n);
            }
        }

        System.out.println(deletions);
    }
}