package list1.extras;

public class Ex10 {
    public static void main(String[] args) {
        double sum = 0;
        for(double i=10, j=1;i>0;i--) {
            if(i % 2 == 1)
                sum += (-1 * (j / i));
            else
                sum += j / i;
        }
        System.out.println("Soma: " + sum);
    }
}
