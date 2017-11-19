package problem1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] data = new int[26];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            int ascii = (int) c;
            if (ascii >= 97) {
                data[ascii-97]++;
            } else {
                data[ascii-65]++;
            }
        }
        int maxIndex = 0;
        for (int i=0; i<26; i++) {
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
        }
        int cnt = 0;
        for (int i=0; i<26; i++) {
            if (data[i]==max)
                cnt++;
        }
        char answer = (char) (maxIndex+65);
        if (cnt>1)
            answer = '?';
        System.out.println(answer);
    }
}
