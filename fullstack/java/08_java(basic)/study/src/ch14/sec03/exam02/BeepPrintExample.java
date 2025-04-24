package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        //작업 스레드 생성
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //작업스레드가 실행하는 코드
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); //삐 소리 출력
                    try { Thread.sleep(500); } catch(Exception e){}
                }
            }
        });

        thread.start(); //작업스레드 실행

        //메인스레드가 실행하는 코드
        for (int i = 0; i < 5; i++) {
            System.out.println("띵"); //띵 출력
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}
