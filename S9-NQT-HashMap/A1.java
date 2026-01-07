// First Non-Repeating Character using hashmap

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ans = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                ans = ch;
                break;
            }
        }

        if (ans == 0) {
            System.out.println("-1");
        } else {
            System.out.println(ans);
        }
    }
}