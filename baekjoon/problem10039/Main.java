package problem10039;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<5; i++) {
            int input = scanner.nextInt();
            if (input <= 40) sum += 40;
            else sum += input;
        }
        System.out.println(sum/5);
    }
}
