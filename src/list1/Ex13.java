package list1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        String name;
        double price, finalPrice;

        name = JOptionPane.showInputDialog("Modelo: ");
        price = Double.parseDouble(
            JOptionPane.showInputDialog("Preço:")
        );
        finalPrice = price;

        int qtyInstallments = 48;
        double ratePercent = 0.015;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        String message = name + "\n" +"Valor não parcelado: " + df.format(price) + "\n\n";
        for(int i=0;i < qtyInstallments;i++) {
            finalPrice += finalPrice * ratePercent;
        }

        message += "\n" + "Valor final: " + df.format(finalPrice) + "\n" + "Diferença: " + df.format(finalPrice - price);
        JOptionPane.showMessageDialog(null, message);
    }
}
