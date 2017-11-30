package problem2609;

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
        int in1 = scanner.nextInt(), in2 = scanner.nextInt();
        String strA = "", strB = "";
        for (int i=0; i<in1; i++)
            strA += '1';
        for (int i=0; i<in2; i++)
            strB += '1';
        long a = Long.parseLong(strA);
        long b = Long.parseLong(strB);
        long gcd = getGCD(Math.max(a,b), Math.min(a,b));
        System.out.println(gcd);
    }
}
