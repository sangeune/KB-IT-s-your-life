package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores = new int[] { 83, 90, 87 };
        printItem(scores);
    }
    
    //printItem 메서드 선언
    public static void printItem(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
}
