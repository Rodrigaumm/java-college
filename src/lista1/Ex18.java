package lista1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        double monthlyRate = 0.02;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Valor: ");
        double quota = scan.nextDouble() / 10;

        System.out.print("Quantidade de meses: ");
        int months = scan.nextInt();

        scan.close();

        for(int i=1; i < months;i++) {
            quota = quota * (1 + monthlyRate);
        }

        System.out.println("Total: " + (quota * 10));
    }
}
