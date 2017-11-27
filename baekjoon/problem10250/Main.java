package problem10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();
        StringBuilder result = new StringBuilder("");
        for (int i=0; i<tc; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();
            String answer = "";

            int room = (N / H);
            if (N % H !=0)
                room += 1;
            int floor = (N % H);
            if (floor == 0)
                floor = H;
            if (room < 10) {
                answer = floor+"0"+room;
            } else {
                answer = String.valueOf(floor)+String.valueOf(room);
            }
            result.append(answer+"\n");
        }
        System.out.print(result);
    }
}
