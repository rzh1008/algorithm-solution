package problem2748;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] d = new long[100];
        d[0] = 0;
        d[1] = 1;
        d[2] = 1;
        for (int i=3; i<=n; i++) {
            d[i] = d[i-1] + d[i-2];
        }
        System.out.println(d[n]);
    }
}
