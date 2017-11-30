package problem4948;

import java.util.Scanner;

public class Main {
    public static boolean[] check = new boolean[300000];
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
        while(true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            int cnt = 0;
            for (int i=n+1; i<=2*n; i++) {
                if (check[i]) {
                    cnt++;
                    continue;
                }
                if (isPrime(i)) {
                    check[i] = true;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
