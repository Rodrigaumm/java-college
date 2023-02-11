package lista1;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        String[] names = new String[10];
        String[] cpfs = new String[10];
        double[][] grades = new double[10][2];
    
        for (int i = 0; i < 10; i++) {
          System.out.println("Digite o nome do " + (i + 1) + "° aluno:");
          names[i] = scan.nextLine();
          
          System.out.println("Digite o CPF do " + (i + 1) + "° aluno:");
          cpfs[i] = scan.nextLine();

          System.out.println("Digite a nota 1 do " + (i + 1) + "° aluno:");
          grades[i][0] = scan.nextDouble();
          
          System.out.println("Digite a nota 2 do " + (i + 1) + "° aluno:");
          grades[i][1] = scan.nextDouble();

          scan.nextLine();
        }

        scan.close();
    
        System.out.println("O nome do 4° aluno é: " + names[3]);
        System.out.println("O CPF do 7° aluno é: " + cpfs[6]);
        System.out.println("A média das notas 1 e 2 do 2° aluno é: " + ((grades[1][0] + grades[1][1]) / 2));
      }
}
