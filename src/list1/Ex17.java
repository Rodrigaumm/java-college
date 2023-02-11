package list1;

public class Ex17 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=160;i<190;i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Soma dos pares no intervalo de 160 a 190: " + sum);
    }
}
