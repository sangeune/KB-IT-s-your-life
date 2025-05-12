package ch18.sec10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        //객체 생성
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = { 1, 2, 3 };

        //객체를 직렬화하여 파일에 저장
        FileOutputStream fos = new FileOutputStream("c:/temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);

        oos.flush();
        oos.close();

        System.out.println("객체를 성공적으로 저장했습니다.");
    }
}
