package list1;

public class Ex02 {
    public static void a() {
        int quantIrmaos = 3;

        if (quantIrmaos >= 2) {
            System.out.println("Tem desconto de 10%");
        } else {
            System.out.println("Não tem desconto");
        }
    }

    public static void b() {
        int qtyStudents = 32;

        if (qtyStudents > 30) {
            System.out.println("Ganharam passagem para Cancún");
        } else if (qtyStudents == 30) {
            System.out.println("Ganharam passagem para Fortaleza");
        } else {
            System.out.println("Ganharam passagem para Caldas Novas");
        }
    }

    public static void c() {
        double totalValue = 637.78;

        if  (totalValue > 150.) {
            System.out.println("Novo valor: " + (totalValue * 0.9));
        } else if (totalValue == 150) {
            System.out.println("Novo valor: " + (totalValue * 0.93));
        } else { 
            System.out.println("Novo valor: " + (totalValue * 0.96));
        }
    }

    public static void d() {
        int qtyPointsInYear = 6;
        
        if (qtyPointsInYear < 5) {
            System.out.println("Você, apesar da multa, é um bom condutor");
        } else if (qtyPointsInYear == 5 ) {
            System.out.println("Apesar de ser um bom condutor, tome cuidado");
        } else { 
            System.out.println("Você é uma pessoa legal, mas tem que prestar mais atenção às leis de trânsito");
        }
    }

    public static void e() {
        int friendsFound = 6;

        if (friendsFound < 5) {
            System.out.println("Você é uma pessoa tranquila");
        } else if (friendsFound == 5 ) {
            System.out.println("Você é uma pessoa normal");
        } else {
            System.out.println("TU TÁ ANIMADO");
        }
    }

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
    }
}
