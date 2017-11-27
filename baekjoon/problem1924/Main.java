package problem1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] monthData = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        String answer = "";
        int cnt = 0;
        for (int i=0; i<m-1; i++)
            cnt += monthData[i];
        cnt += d;
        answer = days[cnt%7];
        System.out.println(answer);
    }
}
