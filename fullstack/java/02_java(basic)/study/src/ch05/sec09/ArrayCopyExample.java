package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        for ( int i = 0; i < oldStrArray.length; i++ ) {
            newStrArray[i] = oldStrArray[i];
        }
        for ( int i = 0; i < newStrArray.length; i++ ) {
            System.out.print( newStrArray[i] + ", " );
        }
    }
}
