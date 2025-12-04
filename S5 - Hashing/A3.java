// Anagram using hashmap

import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        boolean result = areAnagrams(str1, str2);
        System.out.println(result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        return charCountMap.isEmpty();
    }
}
