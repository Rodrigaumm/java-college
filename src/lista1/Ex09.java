package lista1;

import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args) {
        String productName;
        int qty;
        double unitValue;
    
        productName = JOptionPane.showInputDialog("Nome do produto:");
        qty = Integer.parseInt(
            JOptionPane.showInputDialog("Quantidade comprada:")
        );
        unitValue = Double.parseDouble(
            JOptionPane.showInputDialog("Valor unitário:")
        );

        JOptionPane.showMessageDialog(null, 
            productName + "\n"
          + "Quantidade: " + qty + "\n"
          + "Valor unitário: " + unitValue + "\n\n"
          + "Valor total: " + (qty * unitValue)
        );
    }
}
