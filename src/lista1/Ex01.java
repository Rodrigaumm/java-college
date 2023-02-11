package lista1;

public class Ex01 {
    public static void a() {
        System.out.println("Nome: Rodrigo");
        System.out.println("Data Nasc.: 08/02/2023");
        System.out.println("Endereço: Rua Tchurosbango, 1337, Vila Mimosa.");
        System.out.println("Cidade Nasc.: Belford Roxo");
    }

    public static void b() {
        int joao, pedro, lucas, rodolfo, marina;
        joao = 31;
        pedro = 27;
        lucas = 35;
        rodolfo = 23;
        marina = 22;

        System.out.println("João: " + joao + " anos;");
        System.out.println("Pedro: " + pedro + " anos;");
        System.out.println("Lucas: " + lucas + " anos;");
        System.out.println("Rodolfo: " + rodolfo + " anos;");
        System.out.println("Marina: " + marina + " anos;");
    }

    public static void c() {
        double vreal = 3657.38;
        double vdolar = 2.35;

        System.out.println(vreal + " para dólar (" + vdolar + "): " + (vreal / vdolar));
    }
    public static void main(String[] args) {
        a();
        b();
        c();
    }
}
