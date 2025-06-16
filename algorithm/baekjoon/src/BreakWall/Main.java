package BreakWall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        //BFS
        boolean[][][] visited = new boolean[N][M][2];
        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{0, 0, 1, 0});
        visited[0][0][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();

            int r = cur[0], c = cur[1], dist = cur[2], broken = cur[3];

            if (r == N - 1 && c == M - 1) {
                System.out.println(dist);
                return;
            }

            for(int i=0; i<4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < N && nc < M) {
                    if (map[nr][nc] == 0 && !visited[nr][nc][broken]) {
                        //벽이 아님
                        //벽 부순 상태로 방문한 적 없음
                        visited[nr][nc][broken] = true;
                        q.offer(new int[]{nr, nc, dist + 1, broken});
                    }
                    else if (map[nr][nc] == 1 && broken == 0 && !visited[nr][nc][1]) {
                        //벽임
                        //아직 벽을 한 번도 부순 적 없음
                        //벽 부순 상태로 방문한 적 없음
                        visited[nr][nc][1] = true;
                        q.offer(new int[]{nr, nc, dist + 1, 1});
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

