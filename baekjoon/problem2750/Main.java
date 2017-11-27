package problem2750;

import java.util.Scanner;

public class Main {
    public static void sort(int[] array) {
        int length = array.length;
        for (int i=0; i<length; i++) {
            for (int j=i+1; j<length;j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++)
            array[i] = scanner.nextInt();
        sort(array);
        StringBuilder result = new StringBuilder("");
        for (int i=0; i<n; i++)
            result.append(array[i]+"\n");
        System.out.print(result);
    }
}
