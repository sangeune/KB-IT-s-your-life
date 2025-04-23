package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        //TV
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //Audio
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
