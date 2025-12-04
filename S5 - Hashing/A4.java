// First Non-Repeating Character using HashMap

import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return String.valueOf(ch);
            }
        }
        return str;
    }
}
