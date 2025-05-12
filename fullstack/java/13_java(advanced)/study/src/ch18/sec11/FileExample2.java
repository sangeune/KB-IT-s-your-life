package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        //File 객체 생성
        File Dir = new File("c:/temp/images");

        //image 디렉토리가 존재하지 않으면 디렉토리 생성
        if (Dir.exists() == false) { Dir.mkdir(); }

        //temp 폴더 내용 출력
        File temp = new File("C:/temp");
        File[] contents = temp.listFiles();

        //날짜 형식 지정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if(file.isDirectory()){
                System.out.printf("%-10s%-20s", "<Dir>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }

    }
}
