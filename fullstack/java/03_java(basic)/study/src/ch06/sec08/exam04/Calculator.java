package ch06.sec08.exam04;

public class Calculator {
    // 정사각형 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }
}
//메소드 오버로딩:
//메소드 이름은 같은데 매개변수의 타입, 개수, 순서가 다른 메소드를 여러 개 선언하는 것