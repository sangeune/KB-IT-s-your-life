package Laboratory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// - 행, 열, 벽 3가지 정보를 담는다.
// - 바이러스에서 시작해 bfs
// - 벽을 어디에 세울지를 어떻게 정하지..????? → 조합
// - 안전 영역 크기 최댓값

public class Main {
    public static void main(String[] args) throws IOException {
        // 버퍼드리더 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로

        // 지도 입력 받기
        int[][] lab = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] dr = {-1,1,0,0};
        int[] dc = {0,-1,0,1};

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int i=0; i<4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr>=0 && nr<N && nc>=0 && nc<N) {
                    if (lab[nr][nc] == 0) {

                    }
                }
            }
        }

    }
}

