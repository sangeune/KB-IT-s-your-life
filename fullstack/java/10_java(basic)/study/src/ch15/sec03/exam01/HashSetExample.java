package ch15.sec03.exam01;

import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");
        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
//실행 결과
//총 객체 수: 4