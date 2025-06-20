package HideAndSeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] visited = new int[100001];
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(N);
        visited[N] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(visited[cur]-1);
            }

            for(int next : new int[]{cur-1, cur+1, cur*2}) {
                if (next>=0 && next<=100000 && visited[next] == 0) {
                    visited[next] = visited[cur] + 1;
                    q.offer(next);
                }
            }
        }
    }
}

