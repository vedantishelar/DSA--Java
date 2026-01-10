// Find the Element with Odd Frequency in an Array

// A company is analyzing daily website traffic logs.
// Each log entry represents a user ID who visited the website that day.
// Due to a system glitch, exactly one user ID appears an odd number of times, while all other user IDs appear an even number of times.
// Your task is to identify that user ID.
// Important Rules:
// •	There is always exactly one such user ID
// •	User IDs can be negative
// •	Order of input is not sorted
// Input Format:
// •	First line contains an integer N, number of log entries
// •	Second line contains N space-separated integers, representing user IDs
// Output Format:
// •	Print the user ID that appears odd number of times


import java.util.*;

public class A3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                System.out.println(key);
                break;
            }
        }
    }
}
