// Check if Even Sum Beats Odd Sum (GOOD or BAD)

import java.util.*;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        if (evenSum > oddSum) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }
    }
}