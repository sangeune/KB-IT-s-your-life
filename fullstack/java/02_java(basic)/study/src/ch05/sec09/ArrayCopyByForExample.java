package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        //배열 항목 복사
        for ( int i = 0; i < oldIntArray.length; i++ ) {
            newIntArray[i] = oldIntArray[i];
        }
        //출력
        for ( int i = 0; i < newIntArray.length; i++ ) {
            System.out.print( newIntArray[i] + ", " );
        }
    }
}
