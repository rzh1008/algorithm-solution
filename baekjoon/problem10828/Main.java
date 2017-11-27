package problem10828;

import java.util.*;

public class Main {
    public static void push(ArrayList<Integer> stack, int n) {
        stack.add(n);
    }
    public static int pop(ArrayList<Integer> stack) {
        if (stack.size() == 0)
            return -1;
        return stack.remove(stack.size()-1);
    }
    public static int size(ArrayList<Integer> stack) {
        return stack.size();
    }
    public static int empty(ArrayList<Integer> stack) {
        if (stack.size() == 0)
            return 1;
        return 0;
    }
    public static int top(ArrayList<Integer> stack) {
        if (stack.size() == 0)
            return -1;
        return stack.get(stack.size()-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> stack = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine();
        StringBuilder result = new StringBuilder("");
        for (int i=0; i<n; i++) {
            String cmd = scanner.nextLine();
            int output = -10;
            if (cmd.equals("pop")) {
                output = pop(stack);
            } else if (cmd.equals("size")) {
                output = size(stack);
            } else if (cmd.equals("empty")) {
                output = empty(stack);
            } else if (cmd.equals("top")) {
                output = top(stack);
            } else {
                String[] cmds = cmd.split(" ");
                push(stack, Integer.parseInt(cmds[1]));
            }
            if (output != -10)
                result.append(output+"\n");
        }
        System.out.print(result);
    }
}
