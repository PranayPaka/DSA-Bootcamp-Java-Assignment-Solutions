package assignment2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String x = input.next().trim();

        int left = 0;
        int right = x.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (x.charAt(left) != x.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
