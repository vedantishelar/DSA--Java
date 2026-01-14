// Find the maximum possible power balance after removing exactly one element from the array.

// Story: Smart Power Grid Failure Analysis
// A smart power grid records hourly power fluctuations for a day in an array A of size N.
// Positive value → power surplus
// Negative value → power deficit
// Due to instability, the grid authority wants to identify the most stable continuous time period, defined as:
// the maximum net power balance obtained from any continuous subarray.
// However, there is a twist ⚠️
// 👉 Exactly ONE reading is faulty and must be ignored (skipped) while calculating the balance.

import java.util.*;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int noDelete = arr[0];
        int oneDelete = 0;
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            oneDelete = Math.max(oneDelete + arr[i], noDelete);
            noDelete = Math.max(arr[i], noDelete + arr[i]);
            maxSum = Math.max(maxSum, oneDelete);
        }

        System.out.println(maxSum);
    }
}
