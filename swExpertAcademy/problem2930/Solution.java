package problem2930;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder("");
        int tc = scanner.nextInt();
        int TEST_CASE = 1;
        while(TEST_CASE<= tc) {
            int answer = 0;



            result.append("#"+TEST_CASE+++" "+answer+"\n");
        }
        System.out.println(result);
    }
}
