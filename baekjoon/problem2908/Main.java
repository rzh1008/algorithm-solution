package problem2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        String sa="",sb="";
        int a,b;
        for (int i=0; i<3; i++) {
            sa += data[0].charAt(2-i);
            sb += data[1].charAt(2-i);
        }
        a = Integer.parseInt(sa);
        b = Integer.parseInt(sb);
        answer = Math.max(a,b);
        System.out.println(answer);
    }
}
