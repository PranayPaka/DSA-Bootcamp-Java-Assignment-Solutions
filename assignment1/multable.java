import java.util.Scanner;
public class multable {
    public static void main (String[] args){

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(x + " * " + i + " = " + (x * i));
        }

    }
}
