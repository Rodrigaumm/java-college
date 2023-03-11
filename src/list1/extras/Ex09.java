package list1.extras;

public class Ex09 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=10;i>0;i--) {
            if(i % 2 == 1)
                sum += (-1 * (1. / i));
            else
                sum += 1. / i;
        }
        System.out.println("Soma: " + sum);
    }
}
