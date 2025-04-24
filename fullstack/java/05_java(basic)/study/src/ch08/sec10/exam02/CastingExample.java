package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus(); //run만 있음

        vehicle.run();
//        vehicle.checkFare(); //vehicle에 checkFare() 메서드가 없음

        Bus bus = (Bus) vehicle; //강제 타입 변환
        bus.run();
        bus.checkFare();
    }
}
