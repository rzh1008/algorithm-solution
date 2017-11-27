package problem1475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        int[] data = new int[10];
        for (int i=0; i<in.length(); i++) {
            char c = in.charAt(i);
            int n = Character.getNumericValue(c);
            data[n]++;
        }
        int maxNeeds = 0;
        int test = data[6] + data[9];
        if (test %2 != 0) {
            test = (test/2) + 1;
        } else {
            test /= 2;
        }
        for (int i=0; i<10; i++) {
            if (i != 6 && i != 9) {
                maxNeeds = Math.max(maxNeeds,data[i]);
            }
        }
        System.out.println(Math.max(maxNeeds,test));
    }
}
