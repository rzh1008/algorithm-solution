package problem1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        int TEST_CASE=1;
        scanner.nextLine();
        while(TEST_CASE<=tc) {
            String str = scanner.nextLine();
            int answer = 0;
            int cnt = 1;
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i)=='O') {
                    answer += cnt;
                    cnt++;
                } else if (str.charAt(i)=='X') {
                    cnt = 1;
                }
            }
            System.out.println(answer);
            TEST_CASE++;
        }
    }
}
