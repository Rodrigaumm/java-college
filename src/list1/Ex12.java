package list1;

import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        double wage, percentRaise, raiseTimeMonths, monthlyRaise;
        percentRaise = 0.07;
        raiseTimeMonths = 6;
/*         String name, cpf, rg, addr;
        name = JOptionPane.showInputDialog("Nome:");
        cpf = JOptionPane.showInputDialog("CPF:");
        rg = JOptionPane.showInputDialog("RG:");
        addr = JOptionPane.showInputDialog("Endereço:"); */

        wage = Double.parseDouble(
            JOptionPane.showInputDialog("Salário:")
        );

        String message = "Valor inicial: " + wage + "\n\n";
        monthlyRaise = percentRaise / raiseTimeMonths;
        for (int i=1;i <= raiseTimeMonths;i++) {
            wage += wage * monthlyRaise;
            message += "Mês " + i + ": " + wage + "\n";
        }

        message += "\n" + "Valor final: " + wage;
        JOptionPane.showMessageDialog(null, message);
    }
}
