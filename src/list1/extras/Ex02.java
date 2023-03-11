package list1.extras;

public class Ex02 {
    public static void main(String[] args) {
        final double hourlyWage = 18.;
        final double weeklyConstantEarnings = 50.;
        final int hoursWorked = 4;
        final int daysWorked = 5;

        System.out.println(
            "Ganha por semana: " + (((hourlyWage * hoursWorked) * daysWorked) + weeklyConstantEarnings)
        );
    }
}
