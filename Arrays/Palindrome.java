import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {

            int digit = x % 10;

            reversed = reversed * 10 + digit;

            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));

        sc.close();
    }
}
