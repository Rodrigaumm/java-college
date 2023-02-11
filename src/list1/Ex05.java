package list1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner scan = new Scanner(System.in);

        System.out.print("N1: ");
        a = scan.nextDouble();

        System.out.print("N2: ");
        b = scan.nextDouble();

        System.out.print("N3: ");
        c = scan.nextDouble();

        System.out.print("N4: ");
        d = scan.nextDouble();

        scan.close();
        
        System.out.println("Media: " + ((a + b + c + d) / 4));
    }
}
