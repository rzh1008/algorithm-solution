package problem1193;

import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in = scanner.nextInt();
        int groupIndex = 1;
        int itemIndex = 1;
        String answer = "";

        boolean flag = false;
        while(true) {
            if (in > sum(groupIndex) && in <= sum(groupIndex+1)) {
                flag = true;
            }
            if (flag) break;
            groupIndex++;
        }
        int groupSum = groupIndex + 2;
        itemIndex = in - sum(groupIndex);
        int numerator, denominator; // 분자, 분모
        if (groupSum %2 == 0) {
            // 홀수번째 그룹
            numerator = groupSum - itemIndex;
            denominator = itemIndex;
        } else {
            // 짝수번째 그룹
            denominator = groupSum - itemIndex;
            numerator = itemIndex;
        }
        answer = numerator+"/"+denominator;
        System.out.print(answer);
    }
}
