package problem2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        scanner.nextLine();
        int TEST_CASE = 1;
        while(TEST_CASE<=tc) {
            StringBuilder answer = new StringBuilder("");
            String input = scanner.nextLine();
            String[] data = input.split(" ");
            int n = Integer.parseInt(data[0]);
            String str = data[1];
            for (int i=0; i<str.length(); i++) {
                for (int j=0; j<n; j++) {
                    answer.append(str.charAt(i));
                }
            }
            System.out.println(answer);
            TEST_CASE++;
        }
    }
}
