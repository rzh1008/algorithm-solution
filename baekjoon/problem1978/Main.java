package problem1978;

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

        int n = scanner.nextInt();
        int cnt = 0;
        int[] data = new int[n];
        for (int i=0; i<n; i++)
            data[i] = scanner.nextInt();
        for (int i=0; i<n; i++)
            if (isPrime(data[i]))
                cnt++;
        System.out.println(cnt);
    }
}
