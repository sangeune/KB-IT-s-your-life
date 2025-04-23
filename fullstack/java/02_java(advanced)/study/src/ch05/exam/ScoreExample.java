package ch05.exam;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.println("선택> ");
            int selectNum = scanner.nextInt();
            switch (selectNum) {
                case 1:
                    System.out.println("학생수> ");
                    studentNum = scanner.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]> ");
                        scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int j = 0; j < scores.length; j++) {
                        System.out.println("scores[" + j + "]: " + scores[j]);
                    }
                    break;
                case 4:
                    int maxScore = scores[0];
                    int sum = 0;
                    for (int k = 0; k < scores.length; k++) {
                        sum += scores[k];
                        if (scores[k] > maxScore) {
                            maxScore = scores[k];
                        }
                    }
                    System.out.println("최고 점수: " + maxScore);
                    System.out.println("평균: " + sum/studentNum);
                    break;
                case 5:
                    run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
