import java.util.*;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int start = 0;
        int sum = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println(true);
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                return;
            }
        }

        System.out.println(false);
    }    
}
