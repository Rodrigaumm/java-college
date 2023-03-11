package list1.extras;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        double[] itemsDiscountsRates = {0.03, 0.035, 0.042, 0.0475, 0.0512, 0.0523};
        double[] itemsPrices = new double[itemsDiscountsRates.length];
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<itemsDiscountsRates.length;i++) {
            System.out.print("Preço " + (i + 1) + "° item: ");
            itemsPrices[i] = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("====");
        System.out.println("Novos valores");
        System.out.println("====");

        for(int j=0;j<itemsDiscountsRates.length;j++) {
            System.out.println(
                "Preço produto " + j + ": " + (itemsPrices[j] * (1 - itemsDiscountsRates[j]))
            );
        }
    }
}
