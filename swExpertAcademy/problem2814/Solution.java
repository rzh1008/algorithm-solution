package problem2814;

import java.util.Scanner;

public class Solution {
    public static int map[][];
    public static boolean visited[];
    public static int answer,n,m;
    public static void dfs(int depth, int from, int to, boolean visited[]) {
        if (depth > n) return;
        boolean[] copyVisited = new boolean[n + 1];
        for (int i = 1; i <= n; i++)
            copyVisited[i] = visited[i];
        copyVisited[from] = true;
        answer = Math.max(answer, depth + 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == to && j != from) && (!copyVisited[j]) && (map[i][j] != 0)) {
                    dfs(depth + 1, i, j, copyVisited);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        int TEST_CASE=1;
        StringBuilder result = new StringBuilder("");
        while(TEST_CASE<=tc) {
            answer = 1;
            n = scanner.nextInt(); m = scanner.nextInt();
            map = new int[n+1][n+1];
            visited = new boolean[n+1];
            for (int i=0; i<m; i++) {
                int x = scanner.nextInt(), y = scanner.nextInt();
                map[x][y] = 1; map[y][x] = 1;
            }
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=n; j++) {
                    if (map[i][j] != 0) {
                        dfs(1, i, j, visited);
                    }
                }
            }
            result.append("#"+TEST_CASE+++" "+answer+"\n");
        }
        System.out.print(result);
    }
}
