package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList
        List<Board> list = new ArrayList< >();

        //객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        //저장된 요소의 개수
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        //3번째 데이터 출력
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() +
                "\t" + board.getWriter());
        System.out.println();

        //for문으로 리스트 요소 출력
        for(int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
        System.out.println();

        //인덱스2 요소 제거
        list.remove(2);
        list.remove(2);

        //향상된 for문으로 리스트 요소 출력
        for(Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() +
                    "\t" + b.getWriter());
        }
    }
}
