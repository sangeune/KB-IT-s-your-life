package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        //객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력하세요.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            //객체를 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                //가져온 객체 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();

        //객체 제거
        set.remove("JDBC");

        // 향상된 for 문으로  순회하며 각 요소를 출력하세요.
        for (String element : set) {
            System.out.println(element);
        }
    }
}
