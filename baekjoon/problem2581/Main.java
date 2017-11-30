package problem2581;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n==1) return false;
        boolean flag = true;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i ==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i=m; i<=n; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(min,i);
            }
        }
        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
