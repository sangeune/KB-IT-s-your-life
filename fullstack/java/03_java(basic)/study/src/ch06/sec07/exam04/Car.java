package ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    //생성자1
    Car() {
    }

    //생성자2
    Car(String model) {
        this.model = model;
    }

    //생성자3
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //생성자4
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
