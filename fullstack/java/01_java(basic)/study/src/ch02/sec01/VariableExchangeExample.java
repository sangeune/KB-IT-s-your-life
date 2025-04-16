package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        
        System.out.println("x:" + x + ", y:" + y);
        
        int temp = x; // 새로운 변수 선언
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
        
        
    }
}
