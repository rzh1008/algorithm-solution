package problem1977;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();

        int start = (int) Math.sqrt(m);
        int sum = 0, answer = Integer.MAX_VALUE;
        while(true) {
            if (start*start >= m && start*start <= n) {
                sum += start*start;
                answer = Math.min(answer,start*start);
            }
            start++;
            if (start*start > n) break;
        }
        if (sum > 0) {
            System.out.println(sum);
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
