package test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // 배열을 만들고 싶다.
        // 배열을 만들 때를 기준으로 해서
        // 1. 값을 미리 알고 있는 경우
        // 힙 영역에 공간 만들고 값을 바로 넣을 때
        int[] y = {1,2,3};
        // 2. 값을 모르고 있는 경우
        // 힙 영역에 공간 만들고 나중에 값을 넣을 때
        int[] x = new int[3]; // int, int, int, length
        // 배열은 자동 초기화 {0, 0, 0}
        // 같은 타입의 고정 길이를 가지는 목록
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        System.out.println(x.length);
        int [] ages = {50, 45, 35, 25};
        // c 타입의 for문, for를 이용해서 배열에 입력, 출력 가능
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // for-each문 (each-하나씩), 순서대로 하나씩 꺼내옴.
        // 인덱스 사용 불가능
        for (int one: ages) {
            System.out.println(one);
        }

        // 실무에서 배열 목록 확인
        // -> 배열의 요소들을 문자열로 만들어주는 부품 사용
        System.out.println(Arrays.toString(ages));
    }
}

