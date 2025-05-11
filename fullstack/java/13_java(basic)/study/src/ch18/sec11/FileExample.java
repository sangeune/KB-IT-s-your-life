package ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        //File 객체 생성
        File file = new File("C:/temp/file1.txt");

        // 존재 여부 확인
        if (file.exists()) {
            // 파일인지 디렉토리인지 확인
            if (file.isFile()) {
                System.out.println("파일 경로: " + file.getAbsolutePath());
                System.out.println("파일 크기: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                System.out.println("<dir> " + file.getAbsolutePath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
