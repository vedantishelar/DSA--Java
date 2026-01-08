// Crazyyyy Level Question

// A cybersecurity team is analysing a communication log represented as a string S consisting of lowercase English letters.
// A character in the log is called “critically unstable” if ALL the following conditions are satisfied:
// 1️⃣ The character appears at least twice in the string
// 2️⃣ The distance between its first and last occurrence is a prime number
// 3️⃣ The total number of occurrences of this character is strictly greater than
// the average frequency of all distinct characters whose first occurrence index is even
// 4️⃣ Among only the characters that satisfy condition (3),
// this character has the maximum last occurrence index
// 🧾 Input
// A single string S (length ≤ 10⁵)
// 🧾 Output
// Print only one character → the critically unstable character
// If no such character exists, print -1



import java.util.*;

public class A2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();
        HashMap<Character, Integer> firstIndexMap = new HashMap<>();
        HashMap<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!firstIndexMap.containsKey(ch)) {
                firstIndexMap.put(ch, i);
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (!lastIndexMap.containsKey(ch)) {
                lastIndexMap.put(ch, i);
            }
        }

        int sum = 0;
        int div = 0;

        for (Map.Entry<Character, Integer> en : freqMap.entrySet()) {
            char key = en.getKey();
            int firstIndex = firstIndexMap.get(key);
            if(firstIndex % 2 == 0) {
                sum = sum + en.getValue();
                div = div + 1;
            }
        }

        if(div == 0) {
            System.out.println("-1");
            return;
        }

        double avg = (double) sum / div;
        char ans = 0;
        int max = -1;

        for (Map.Entry<Character, Integer> en : freqMap.entrySet()) {
            char key = en.getKey();
            int firstIndex = firstIndexMap.get(key);
            int lastIndex = lastIndexMap.get(key);
            int distance = lastIndex - firstIndex;

            if(en.getValue() >= 2 && prime(distance) && en.getValue() > avg) {
                if(lastIndex > max) {
                    max = lastIndex;
                    ans = key;
                }
                else if(lastIndex == max && key < ans) {
                    ans = key;
                }
            }
        }

        System.out.println(ans == 0 ? "-1" : ans);
    }

    public static boolean prime(int distance) {
        if(distance <= 1) return false;
        for(int i = 2; i * i <= distance; i++) {
            if(distance % i == 0) return false;
        }
        return true;
    }
}