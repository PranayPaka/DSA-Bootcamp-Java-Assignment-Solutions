package assignment2;
import java.util.Scanner;
public class oddornot {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = input.nextInt();

        if( x % 2 == 0){

            System.out.println("Number is Even");
        }

        else{
            System.out.println("Number is odd");
        }

    }
}
