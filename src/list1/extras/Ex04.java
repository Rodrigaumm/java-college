package list1.extras;

public class Ex04 {
    public static void main(String[] args) {
        final double debtValue = 134.;
        final double monthlyFineRate = 0.03;

        System.out.println(
            "Após 1 mês: " + (debtValue * Math.pow((1+monthlyFineRate), 1))
        );
        System.out.println(
            "Após 3 meses: " + (debtValue * Math.pow((1+monthlyFineRate), 3))
        );

        int counter = 1;
        double newDebtValue = debtValue;
        double spotHitValue = 0;
        int spot = -1;
        while(true) {
            if(newDebtValue >= 160 && spot == -1) {
                spot = counter;
                spotHitValue = newDebtValue;
            }

            if(newDebtValue >= (debtValue * 2)) {
                break;
            }

            newDebtValue += (newDebtValue * monthlyFineRate);
            System.out.println(newDebtValue);
            counter++;
        }
        System.out.println("Ultrapassará 160 reais em " + spot + " meses atingindo " + spotHitValue + " reais");
        System.out.println(
            "Ultrapassará o dobro (" + (debtValue * 2) + ") em " + counter + " meses atingindo " + newDebtValue + " reais"
        );
    }
}
