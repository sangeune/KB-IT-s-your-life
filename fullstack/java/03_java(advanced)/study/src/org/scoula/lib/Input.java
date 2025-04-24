package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    //문자열 입력
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    };

    public static String read(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = sc.nextLine();
        //그냥 엔터 쳤으면 defaultValue 리턴, 입력값 있으면 answer 리턴
        return answer.isEmpty() ? defaultValue : answer;
    }

    //정수 입력
    public int readInt(String title) {
        System.out.print(title);
        return sc.nextInt();
    }

    //yes/no 확인
    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);

        String answer = sc.nextLine();
        if (answer.isEmpty())
            return defaultValue;

        return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
