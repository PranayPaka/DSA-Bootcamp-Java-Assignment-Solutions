package assignment2;
import java.util.Scanner;
public class largest {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if( x > y) {
            System.out.println(x + " is the largest.");
        }

        else{

            System.out.println(y + " is the largest");
        }

    }
}
