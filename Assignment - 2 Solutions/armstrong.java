package assignment2;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();

        int original = num;
        int sum = 0;

        // count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
