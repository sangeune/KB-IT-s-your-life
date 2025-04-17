package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요."); //문자열이 포함되어 있지 않으면 -1 리턴
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
