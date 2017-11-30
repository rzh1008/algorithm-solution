package problem13241;

import java.util.Scanner;

public class Main {
    public static long getGCD(long n1, long n2) {
        long tmp = 0;
        while(n2!=0) {
            tmp = n1%n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = getGCD(Math.max(a,b), Math.min(a,b));
        long lcm = a*b / gcd;
        System.out.print(lcm);
    }
}
