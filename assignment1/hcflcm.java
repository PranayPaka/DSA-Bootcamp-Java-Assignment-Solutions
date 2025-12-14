import java.util.Scanner;

public class hcflcm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int a = x; // store original values
        int b = y;

        // Euclid's algorithm for HCF
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        System.out.println("HCF: " + hcf);

        // LCM formula: (a * b) / HCF
        int lcm = (a * b) / hcf;
        System.out.println("LCM: " + lcm);
    }
}
