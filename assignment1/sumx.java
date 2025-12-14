import java.util.Scanner;

public class sumx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String value = input.next(); // read as string

            if (value.equals("x")) {
                break; // stop if user types x
            }

            // convert string to number
            int num = Integer.parseInt(value);
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
