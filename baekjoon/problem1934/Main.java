package problem1934;

import java.util.Scanner;

public class Main {
    public static int getGCD(int n1, int n2) {
        int tmp = 0;
        while(n2!=0) {
            tmp = n1%n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        StringBuilder result = new StringBuilder("");
        for (int i=0; i<tc; i++) {
            long lcm = 0;
            int gcd = 0;
            int a = scanner.nextInt(), b = scanner.nextInt();
            int n1 = Math.max(a,b);
            int n2 = Math.min(a,b);
            gcd = getGCD(n1,n2);
            lcm = a*b / gcd;
            result.append(lcm+"\n");
        }
        System.out.print(result);
    }
}
