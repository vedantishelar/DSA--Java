// 📦 Problem: Warehouse Load Balancer

// A logistics company manages a warehouse with N containers placed in a single row.
// Each container has a load value representing its weight.

// Due to safety rules, the warehouse manager wants to identify a continuous block of containers such that:

// The total load of the selected block is maximum

// At least one container must be selected

// Containers must be selected in order (continuous)

// Your task is to help the manager determine the maximum total load that can be achieved by selecting such a block.

import java.util.*;

public class A8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
