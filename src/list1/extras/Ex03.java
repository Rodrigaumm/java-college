package list1.extras;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        final double quotationLoyalty1 = 220.;
        final double quotationLoyalty2 = 173.;

        final double quotationDaily1 = 129;
        final double quotationDaily2 = 162;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de diarias: ");
        int days = scanner.nextInt();
        scanner.close();

        double quotation1 = (quotationDaily1 * days) + quotationLoyalty1;
        double quotation2 = (quotationDaily2 * days) + quotationLoyalty2;
        System.out.println("Orçamento 1: " + quotation1);
        System.out.println("Orçamento 2: " + quotation2);
        System.out.println("Orçamento mais barato: " + (quotation1 < quotation2 ? "Orçamento 1" : "Orçamento 2"));
    }
}
