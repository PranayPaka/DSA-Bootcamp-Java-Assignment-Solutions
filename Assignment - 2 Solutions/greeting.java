package assignment2;

import java.util.Scanner;
public class greeting {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name to greet: ");
        String x = input.next();

        System.out.println("Hello " + x);

        }
    }

