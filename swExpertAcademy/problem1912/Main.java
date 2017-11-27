package problem1912;

import java.util.Scanner;

class Main {

    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    public static void dfs(int sum, int[][] data, int[] result, int N, int W, int i) {
        sum += data[i][1];

    }
    public boolean selectWeight(int[][] data, int[] result, int N, int W) {
        // TODO implement your codes to here.
        for (int i=0; i<N; i++) {
            int sum = 0;
            dfs(sum, data, result, N, W, i);
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();

        try (Scanner scan = new Scanner(System.in)) {
            int TC = scan.nextInt();

            for (int tc = 1; tc <= TC; tc++) {
                int W = scan.nextInt();
                int N = scan.nextInt();

                int[][] data = new int[N][2];
                int[] result = new int[N];

                for (int i = 0; i < N; ++i) {
                    data[i][0] = scan.nextInt();
                    data[i][1] = scan.nextInt();
                }

                System.out.println("#" + tc);
                if (!main.selectWeight(data, result, N, W)) {
                    System.out.println("FAIL");
                } else {
                    for (int i = 0; i < N; i++) {
                        System.out.println(data[i][0] + " " + result[i]);
                    }
                }
            }
        }
    }
}