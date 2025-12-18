// Find all unique quadruplets [a,b,c,d] such that a+b+c+d = target using hash map for pair sums.

import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int target = sc.nextInt();

        int n = arr.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        HashMap<Integer, List<int[]>> map = new HashMap<>();

        // store all pair sums
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];

                if (!map.containsKey(sum)) {
                    map.put(sum, new ArrayList<>());
                }

                map.get(sum).add(new int[]{i, j});
            }
        }

        HashSet<String> result = new HashSet<>();

        // find complementary pairs
        for (int sum1 : map.keySet()) {
            int sum2 = target - sum1;

            if (!map.containsKey(sum2)) continue;

            List<int[]> list1 = map.get(sum1);
            List<int[]> list2 = map.get(sum2);

            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    int a = list1.get(i)[0];
                    int b = list1.get(i)[1];
                    int c = list2.get(j)[0];
                    int d = list2.get(j)[1];

                    if (a != c && a != d && b != c && b != d) {
                        int[] quad = {nums[a], nums[b], nums[c], nums[d]};
                        Arrays.sort(quad);

                        result.add(
                            quad[0] + " " +
                            quad[1] + " " +
                            quad[2] + " " +
                            quad[3]
                        );
                    }
                }
            }
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
