package list1;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        double sum = 0, inputNumber;
        int counter = 0;

        while (true) {
            inputNumber = Double.parseDouble(
                JOptionPane.showInputDialog("N" + counter)
            );

            if (inputNumber == 9999) {
                break;
            }

            sum += inputNumber;
            counter++;
        }
        

        DecimalFormat df = new DecimalFormat("0.00");
        String message;
        if (counter != 0) {
            message = "Média dos " + counter + " valores:\n" + df.format(sum / counter);
        } else {
            message = "Nenhum valor informado, impossível calcular a média";
        }
        
        JOptionPane.showMessageDialog(null, message);
    }
}
