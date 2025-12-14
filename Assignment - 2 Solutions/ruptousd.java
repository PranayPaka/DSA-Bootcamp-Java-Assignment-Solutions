package assignment2;

import java.util.Scanner;

public class ruptousd {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        double x = input.nextDouble();

        double usd = x / 90;

        System.out.println("Amount in usd is: " + usd);
    }
}
