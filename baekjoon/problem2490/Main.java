package problem2490;
import java.util.*;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++) {
        int a=0, b=0;
        for (int j=0; j<4; j++) {
        int in = scanner.nextInt();
        if (in > 0) {
        b++;
        } else {
        a++;
        }
        }
        if (a==0) {
        System.out.println("E");
        } else if (a==1) {
        System.out.println("A");
        } else if (a==2) {
        System.out.println("B");
        } else if (a==3) {
        System.out.println("C");
        } else if (a==4) {
        System.out.println("D");
        }
        }
        }
        }