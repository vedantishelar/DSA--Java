// For each window of size k in array, count distinct elements

import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] arr = str.split(" ");

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(arr[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print(map.size() + " ");

        for (int i = k; i < arr.length; i++) {
            int add = Integer.parseInt(arr[i]);
            int remove = Integer.parseInt(arr[i - k]);

            map.put(add, map.getOrDefault(add, 0) + 1);

            map.put(remove, map.get(remove) - 1);
            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            System.out.print(map.size() + " ");
        }
    }
}
