// Maximum Subarray Sum – Stock Market Crash

// An investor wants to know the maximum profit streak (continuous days). 

import java.util.*;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                start = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                ansStart = start;
                ansEnd = i;
            }
        }

        System.out.println(maxSum);

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
