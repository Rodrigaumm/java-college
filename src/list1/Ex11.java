package list1;

import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        double np1, instutional, np2, semesterGrade;

        np1 = Double.parseDouble(
            JOptionPane.showInputDialog("Nota NP1:")
        );

        instutional = Double.parseDouble(
            JOptionPane.showInputDialog("Nota institucional:")
        );

        np2 = Double.parseDouble(
            JOptionPane.showInputDialog("Nota NP2:")
        );

        semesterGrade = ((np1 * 3) + (instutional * 4) + (np2 * 3)) / 10;

        if (semesterGrade < 7.) {
            double exam = Double.parseDouble(
                JOptionPane.showInputDialog("Exame:")
            );

            semesterGrade = (semesterGrade + exam) / 2;
        }

        JOptionPane.showMessageDialog(null, "Média:\n" + semesterGrade);
    }
}
