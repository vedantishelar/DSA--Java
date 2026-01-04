// Sort string characters by decreasing frequency.

import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if (fa != fb) {
                return fb - fa;
            } else {
                return a - b;
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);
            int freq = map.get(ch);
            for (int j = 0; j < freq; j++) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}