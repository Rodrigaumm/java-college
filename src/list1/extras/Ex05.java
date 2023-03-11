package list1.extras;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        double n = scanner.nextDouble();
        scanner.close();

        System.out.println("Dobro: " + n * 2);
        System.out.println("Triplo: " + n * 3);
        System.out.println("Quadruplo: " + n * 4);
        System.out.println("Quintuplo: " + n * 5);

    }
}
