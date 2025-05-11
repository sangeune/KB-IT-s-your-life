package ch09.sec06.exam03;

import ch09.sec06.exam01.Button;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        ////Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class OKListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK버튼을 클릭했습니다.");
            }
        }
    }
}
