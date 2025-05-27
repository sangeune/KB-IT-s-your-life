package StartTaxi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //1. 첫 줄 입력: N, M, fuel
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int fuel = Integer.parseInt(st.nextToken());

        //2. N x N 맵 입력
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //3. 택시 시작 위치 입력 (행, 열) - 1-based indexing일 수도 있으니 문제 잘 확인!
        st = new StringTokenizer(br.readLine());
        int taxiR = Integer.parseInt(st.nextToken()) - 1; // 0-based 변환
        int taxiC = Integer.parseInt(st.nextToken()) - 1;

        //4. 승객 정보 M개 입력: 출발R, 출발C, 도착R, 도착C
        int[][] passengers = new int[M][4];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            passengers[i][0] = Integer.parseInt(st.nextToken()) - 1; // 출발 행 (0-based)
            passengers[i][1] = Integer.parseInt(st.nextToken()) - 1; // 출발 열
            passengers[i][2] = Integer.parseInt(st.nextToken()) - 1; // 도착 행
            passengers[i][3] = Integer.parseInt(st.nextToken()) - 1; // 도착 열
        }

        //방문 배열
        boolean[][] visited = new boolean[N][N];

        //상하좌우
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

//        //bfs
//        public static int bfs(map, int sr, int sc){
//            Queue<int[]> q = new LinkedList<>();
//            q.offer(new int[]{sr, sc, 0}); //행, 열, 거리
//            visited[sr][sc] = true;
//
//            while (!q.isEmpty()) {
//                int[] cur = q.remove(); //큐에서 꺼내기
//                int r = cur[0];
//                int c = cur[1];
//                int d = cur[2];
//
//                for (int k = 0; k < 4; k++) {
//                    int nr = c + dr[k];
//                    int nc = c + dc[k];
//
//                    if (nr >= 0 && nr < N && nc >= 0 && nc < N && map[nr][nc] == 0) {
//                        if (!visited[nr][nc]) {
//                            visited[nr][nc] = true;
//                            q.add(new int[]{nr, nc, d+1}); //큐에 추가
//                        }
//                    }
//                }
//                System.out.println(d);
//            }
//
//        }
    }
}