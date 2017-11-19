package problem1316;

import java.util.Scanner;

public class Main {
    public static boolean isGroupWord(String word) {
        boolean[] data = new boolean[26];
        char c = ' ';
        boolean flag = true;
        for (int i=0; i<word.length(); i++) {
            if (!(c==word.charAt(i))) {
                c = word.charAt(i);
                if (data[((int) c)-97]) {
                    flag = false;
                    break;
                }
                data[((int) c)-97] = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int cnt = 0;
        for (int i=0; i<n; i++)
            if (isGroupWord(scanner.nextLine()))
                cnt++;
        System.out.println(cnt);
    }
}
