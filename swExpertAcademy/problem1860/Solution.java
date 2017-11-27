package problem1860;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        int TEST_CASE = 1;
        StringBuilder result = new StringBuilder("");
        while(TEST_CASE<= tc) {
            boolean flag = false;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arrive = new int[n];
            int index = 0;
            int newM = m;
            for (int i=0; i<n; i++)
                arrive[i] = scanner.nextInt();
            Arrays.sort(arrive);
            while(true) {
                if (arrive[index] >= newM) {
                    index += k;
                    newM += m;
                } else {
                    flag = false;
                    break;
                }
                if (index >= n) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                result.append("#"+TEST_CASE+++" Possible\n");
            } else {
                result.append("#"+TEST_CASE+++" Impossible\n");
            }
        }
        System.out.println(result);
    }
}
