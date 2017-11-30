package problem1929;

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
        StringBuilder result = new StringBuilder("");
        for (int i=m; i<=n; i++)
            if (isPrime(i))
                result.append(i+"\n");
        System.out.print(result);
    }
}
