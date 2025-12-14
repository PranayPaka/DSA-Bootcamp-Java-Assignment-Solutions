
import java.util.Scanner;

public class sum {
    public static void main (String[] args){

        System.out.print("Enter x and y values: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int sum = x + y;
        System.out.println("The sum of x and y is: " + sum);

    }
}
