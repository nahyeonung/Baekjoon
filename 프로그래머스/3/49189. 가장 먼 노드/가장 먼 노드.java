import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 1) 인접 리스트
        List<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        for (int[] e : edge) {
            int a = e[0], b = e[1];
            g[a].add(b);
            g[b].add(a);
        }

        // 2) BFS
        int[] dist = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1);
        visited[1] = true;
        dist[1] = 0;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : g[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    dist[v] = dist[u] + 1;
                    q.add(v);
                }
            }
        }

        // 3) 정렬 없이 최댓값과 개수 계산
        int max = 0, cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] > max) {
                max = dist[i];
                cnt = 1;
            } else if (dist[i] == max) {
                cnt++;
            }
        }
        return cnt;
    }
}