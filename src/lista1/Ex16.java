package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        double interestRate = 0.1;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor: ");
        double value = scan.nextDouble();

        System.out.print("Quantidade de meses: ");
        int months = scan.nextInt();

        scan.close();

        DecimalFormat df = new DecimalFormat("0.00");
        for(int i=1;i<=months;i++) {
            String message = i + "° mês: " + df.format(value) + " * " + (1+interestRate) + " = ";
            value += value * interestRate;
            message += df.format(value);

            System.out.println(message);
        }
        
    }
}
