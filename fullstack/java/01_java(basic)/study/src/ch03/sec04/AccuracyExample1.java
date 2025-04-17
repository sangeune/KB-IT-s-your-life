package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}

//사과 1개에서 남은 양: 0.29999999999999993
//부동소수점 오차 때문에 double 타입에서 0.1을 이진수로 변환하면서 오차 발생