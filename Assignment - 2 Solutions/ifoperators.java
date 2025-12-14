
package assignment2;

import java.util.Scanner;

public class ifoperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b and operator: ");
        int a = input.nextInt();
        int b = input.nextInt();
        char op = input.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println(result);
    }
}
