package problem6064;
//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int tc = scanner.nextInt();
//        for (int i=0; i<tc; i++) {
//            int M = scanner.nextInt();
//            int N = scanner.nextInt();
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            int sx = 1, sy = 1;
//            int year = 1;
//            boolean flag = false;
//            while(true) {
//                if (sx == x && sy == y) {
//                    flag = true;
//                }
//                if (flag) break;
//                if (sx == M && sy == N) {
//                    year = -1;
//                    break;
//                }
//                sx++; sy++;
//                if (sx == M+1) sx = 1;
//                if (sy == N+1) sy = 1;
//                year++;
//            }
//            System.out.println(year);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        int TEST_CASE = 1;
        while(TEST_CASE++<=tc) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = 0;
            int b = 0;
            int answer = -1;
            int gcd=0;
            int big = Math.max(m,n);
            for (int i=big; i>0; i--) {
                if (m%i ==0 && n%i==0) {
                    gcd=i;
                    break;
                }
            }
            long lcm = m*n/gcd;

            for (int i=0; i<lcm; i++) {
                a++;
                b++;
                if (a==x && b==y)
                    answer = i+1;
                if (a > m)
                    a = 1;
                if (b > n)
                    b = 1;
            }

            System.out.printf("%d\n",answer);
        }
    }
}

