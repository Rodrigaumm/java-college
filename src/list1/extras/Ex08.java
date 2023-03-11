package list1.extras;

public class Ex08 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<11;i++) {
            if(i % 2 == 0)
                sum += (-1 * i);
            else
                sum += i;
        }
        System.out.println("Soma: " + sum);
    }
}
