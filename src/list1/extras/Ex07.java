package list1.extras;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07 {
    static class AgeInput {
        String name;
        int age;

        public AgeInput(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " + age + " anos.";
        }
    }
    public static void main(String[] args) {
        final int year = 2023;
        ArrayList<AgeInput> ages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nameInput = scanner.next();
        System.out.print("Ano de nascimento: ");
        int yearInput = Integer.parseInt(scanner.next());

        while(yearInput != 0) {
            ages.add(
                new AgeInput(nameInput, (year - yearInput))
            );

            System.out.print("Nome: ");
            nameInput = scanner.next();
            System.out.print("Ano de nascimento: ");
            yearInput = scanner.nextInt();
        }

        scanner.close();
        
        System.out.println("====");
        System.out.println("Idades menores que 18");
        ages.stream()
        .filter((AgeInput ageInput)->{
            return (ageInput.age < 18);
        })
        .collect(Collectors.toList())
        .forEach((AgeInput ageInput) -> {
            System.out.println(ageInput);
        });;
        System.out.println("====\n");

        System.out.println("====");
        System.out.println("Idades menores ou iguais a 30");
        ages.stream()
        .filter((AgeInput ageInput)->{
            return (ageInput.age >= 18 && ageInput.age <= 30);
        })
        .collect(Collectors.toList())
        .forEach((AgeInput ageInput) -> {
            System.out.println(ageInput);
        });;
        System.out.println("====\n");

        System.out.println("====");
        System.out.println("Idades menores que 50");
        ages.stream()
        .filter((AgeInput ageInput)->{
            return (ageInput.age > 30 && ageInput.age < 50);
        })
        .collect(Collectors.toList())
        .forEach((AgeInput ageInput) -> {
            System.out.println(ageInput);
        });;
        System.out.println("====\n");

        System.out.println("====");
        System.out.println("Idades menores que 80");
        ages.stream()
        .filter((AgeInput ageInput)->{
            return (ageInput.age >= 50 && ageInput.age < 80);
        })
        .collect(Collectors.toList())
        .forEach((AgeInput ageInput) -> {
            System.out.println(ageInput);
        });;
        System.out.println("====");

    }
}
