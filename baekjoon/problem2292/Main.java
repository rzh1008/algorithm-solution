package problem2292;

import java.util.Scanner;

public class Main {
    public static int calcul(int index) {
        return (3*index*index) - (3*index) + 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        boolean flag = false;
        int index = 0;
        while(true) {
            if (calcul(index)+1 < n && calcul(index+1)+1 >= n)
                flag = true;
            if (flag) break;
            index++;
        }
        System.out.println(index+1);
    }
}
