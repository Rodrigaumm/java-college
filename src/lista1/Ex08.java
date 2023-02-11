package lista1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int houseNumber;
/*         String name, addr;

        System.out.print("Nome: ");
        name = scan.nextLine();

        System.out.println("Endereço: ");
        addr = scan.nextLine(); */

        System.out.print("Número da casa: ");
        houseNumber = scan.nextInt();
    
        scan.close();

        if (houseNumber < 65) {
            System.out.println("Você pagará o IPTU desse ano parcelado em três vezes");
        } else if (houseNumber == 65) {
            System.out.println("Você pagará o IPTU desse ano em duas parcelas");
        } else {
            System.out.println("Você pagará o IPTU à vista");
        }
    }
}
