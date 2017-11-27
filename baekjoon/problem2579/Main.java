package problem2579;

import java.util.Scanner;

public class Main {
    static int[] st;
    static int n;
    public static int getAnswer() {
        int answer = 0;
        int[] d = new int[n+1];
        d[1] = st[1];
        d[2] = st[1]+st[2];
        d[3] = Math.max(st[1],st[2]) + st[3];
        // 예외처리
        if (n==1) {
            answer = d[1];
        } else if (n==2) {
            answer = d[1]+d[2];
        } else if (n>=3) {
            for (int i=4; i<= n; i++) {
                d[i] = Math.max(d[i-2] + st[i], d[i-3]+st[i-1]+st[i]);
            }
            answer = d[n];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        st = new int[n+1];
        for (int i=1; i<=n; i++)
            st[i] = scanner.nextInt();
        System.out.print(getAnswer());
    }
}
