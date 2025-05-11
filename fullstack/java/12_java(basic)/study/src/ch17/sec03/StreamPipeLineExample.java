package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );
        //list를 스트림으로 바꿈
        double avg = list.stream()
                //각 student의 점수를 int로 꺼냄 (중간 처리)
                .mapToInt(student-> student.getScore())
                //평균 계산 (최종 처리)
                .average()
                //double 값 꺼냄
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
