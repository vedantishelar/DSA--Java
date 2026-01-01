// Find all start indices of p's anagrams in string s.

import java.util.*;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String p = sc.nextLine();

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            return;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;  
            sCount[s.charAt(i - p.length()) - 'a']--; 

            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        System.out.println(result);
    }
}
