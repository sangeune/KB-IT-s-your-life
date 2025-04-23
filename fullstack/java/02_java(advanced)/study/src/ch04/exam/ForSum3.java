package ch04.exam;
//3번
public class ForSum3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 총합: " + sum);
    }
}
