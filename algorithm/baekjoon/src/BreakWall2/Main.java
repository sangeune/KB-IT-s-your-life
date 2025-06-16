package BreakWall2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        boolean[][][] visited = new boolean[N][M][2];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0, 1, 0}); // r, c, dist, broken
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

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < N && nc < M) {
                    if (map[nr][nc] == 0 && !visited[nr][nc][broken]) {
                        visited[nr][nc][broken] = true;
                        q.offer(new int[]{nr, nc, dist + 1, broken});
                    } else if (map[nr][nc] == 1 && broken == 0 && !visited[nr][nc][1]) {
                        visited[nr][nc][1] = true;
                        q.offer(new int[]{nr, nc, dist + 1, 1});
                    }
                }
            }
        }

        System.out.println(-1);
    }
}

