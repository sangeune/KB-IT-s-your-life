package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}
