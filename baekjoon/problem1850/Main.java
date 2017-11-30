package problem1850;

import java.util.Scanner;

public class Main {
    public static long getGCD(long n1, long n2) {
        while(n2!=0) {
            long tmp = n1%n2;
            n1 = n2;
            n2 = tmp;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();
        String strA = "", strB = "";
        for (int i=0; i<a; i++)
            strA += '1';
        for (int i=0; i<b; i++)
            strB += '1';
        long longA = Long.parseLong(strA);
        long longB = Long.parseLong(strB);
        long gcd = getGCD(Math.max(longA,longB), Math.min(longA,longB));
        System.out.println(gcd);
    }
}
