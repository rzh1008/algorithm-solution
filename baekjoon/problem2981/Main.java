package problem2981;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] data = new int[n];
        for (int i=0; i<n; i++)
            data[i] = scanner.nextInt();



        for (int i=0; i<list.size(); i++)
            System.out.print(list.get(i)+" ");
    }
}
