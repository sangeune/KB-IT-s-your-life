package thread;

public class Counter extends Thread {
    //재정의하는 경우에는 원본 모양을 변경하면 X
    //public void run() throws Exception X
    @Override
    public void run() {
        super.run();
    }
}
