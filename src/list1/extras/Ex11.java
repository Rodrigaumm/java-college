package list1.extras;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
    static class InvalidOptionException extends RuntimeException {
        public InvalidOptionException() {
            super();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> passwords = new ArrayList<>();
        boolean shouldQuit = false;
        int userOption = -1;

        while(!shouldQuit) {
            System.out.println(
                "1 - Armazenar senha\n" +
                "2 - Validar senha\n" +
                "3 - Sair"
            );
            System.out.print("Escolha uma opçao: ");
            try {
                userOption = Integer.parseInt(scanner.nextLine());
                if(
                    userOption != 1 && 
                    userOption != 2 && 
                    userOption != 3
                ) {
                    throw new InvalidOptionException();
                }
            } catch (NumberFormatException | InvalidOptionException e) {
                System.out.println("Opçao invalida, tente novamente\n\n");
                continue;
            }

            if(userOption == 1) {
                System.out.print("Digite a senha: ");
                passwords.add(scanner.nextLine());
            } else if(userOption == 2) {
                System.out.print("Digite a senha: ");
                String userInputPasswd = scanner.nextLine();
                if(
                    passwords
                    .stream()
                    .filter((String passwd) -> {
                        if(userInputPasswd.equals(passwd))
                            return true;

                        return false;
                    }).count() >= 1L
                )
                    System.out.println("Senha válida!");
                else
                    System.out.println("Senha inválida!");
            } else {
                shouldQuit = true;
            }

            System.out.println();
        }

        scanner.close();
    }
}
