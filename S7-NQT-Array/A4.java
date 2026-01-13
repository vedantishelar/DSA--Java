// Find Second Largest – Salary Hike Analysis

// A company wants to find the second highest salary from a list to decide bonus slabs.

import java.util.*;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);

    }
}
