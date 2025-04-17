package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]: " + arr1[i]);
        }
        System.out.println();

        String[] arr2 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "]: " + arr2[i]);
        }
    }
}
