package problem2920;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "ascending";
        int[] data = new int[8];
        boolean isAsc = true, isDesc = true;
        for (int i=1; i<=8; i++) {
            data[i-1] = scanner.nextInt();
            if (i != data[i-1]) isAsc = false;
            if (9-i != data[i-1]) isDesc = false;
        }
        if (isAsc)
            answer = "ascending";
        else if (isDesc)
            answer = "descending";
        else
            answer = "mixed";

        System.out.println(answer);
    }
}