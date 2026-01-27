// Password Strength Analyzer
// A company defines a password as STRONG if it satisfies all the following conditions:
// 1️⃣ Contains at least one uppercase letter
// 2️⃣ Contains at least one lowercase letter
// 3️⃣ Contains at least one digit
// 4️⃣ Contains at least one special character from @ # $ % &
// 5️⃣ Length of the password is at least 8
// Your task is to determine whether the given password is STRONG or WEAK

import java.util.*;

public class A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (s.length() < 8) {
            System.out.println("WEAK");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            } else if (ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '&') {
                hasSpecial = true;
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("STRONG");
        } else {
            System.out.println("WEAK");
        }
    }
}