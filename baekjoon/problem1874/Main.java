package problem1874;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int n = scanner.nextInt();
        int[] data = new int[n+1];
        int max = Integer.MIN_VALUE;
        for (int i=1; i<=n; i++) {
            data[i] = scanner.nextInt();
            max = Math.max(max,data[i]);
        }
        StringBuilder result = new StringBuilder("");
        boolean[] popped = new boolean[max+1];

        int value = 1;
        for (int i=1; i<=n; i++) {
            boolean flag = false;
            if (popped[data[i]]) {
                result.append("NO\n");
                continue;
            }
            if (stack.peek() < data[i]) {
                while(true) {
                    if (stack.peek() != data[i]) {
                        stack.push(value++);
                        result.append("+\n");
                    } else {
                        stack.pop();
                        result.append("-\n");
                        flag = true;
                    }
                    if (flag) break;
                }
            } else {
                while(true) {
                    if (stack.peek() == data[i]) {
                        flag = true;
                    }
                    popped[stack.pop()] = true;
                    result.append("-\n");
                    if (flag) break;
                }
            }
        }
        System.out.print(result);
    }
}
