// Count all pairs in array that sum a target 

import java.util.*;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            int complement = target - num;

            if (map.containsKey(complement)) {
                count = count + map.get(complement);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(count);
    }
}