// Group anagrams together from array of strings

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();  

        String[] arr = str.split(" ");

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);  
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> group : map.values()) {
            result.add(group);
        }

        System.out.println(result);
    }
}
