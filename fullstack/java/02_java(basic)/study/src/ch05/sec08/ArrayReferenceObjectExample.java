package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        
        System.out.println( strArray[0] == strArray[1] );
        System.out.println( strArray[0] == strArray[2] );
        System.out.println( strArray[0].equals(strArray[2]) );
    }
}
//true -> 같은 객체 참조
//false -> 다른 객체 참조
//true -> 문자열 동일

//strArray[2]는 새로운 객체를 생성하기 때문에 주소가 다르다.