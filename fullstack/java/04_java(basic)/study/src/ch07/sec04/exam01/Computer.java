package ch07.sec04.exam01;

import ch07.sec03.exam02.SmartPhone;

public class Computer extends Calculator {
    //오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
