package assignment2;
import java.util.Scanner;
public class simpleint {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for p, t and r: ");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();

        int simpint = (p * t * r) / 100;

        System.out.println("Simple Interest is: " + simpint);

    }
}
