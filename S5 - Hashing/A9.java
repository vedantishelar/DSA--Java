// Check if two strings are isomorphic (character mapping are bijective)

import java.util.*;

public class A9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Forward mapping check
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {
                map1.put(c1, c2);
            }

            // Reverse mapping check
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) {
                    System.out.println(false);
                    return;
                }
            } else {
                map2.put(c2, c1);
            }
        }

        System.out.println(true);
    }
}