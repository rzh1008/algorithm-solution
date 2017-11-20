package problem2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cnt = 0, i=0;
        char c1,c2,c3;
        boolean flag = false;
        while(true) {
            if (i>input.length()-1) break;
            c2 = ' '; c3 = ' ';
            c1 = input.charAt(i);
            if (c1=='c') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (c2=='=' || c2=='-') {
                    i += 2;
                } else {
                    i += 1;
                }
            } else if (c1=='d') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (i<input.length()-2) {
                    c3 = input.charAt(i+2);
                }
                if (c2=='-') {
                    i += 2;
                } else if (c2=='z') {
                    if (c3=='=') {
                        i += 3;
                    } else {
                        i += 1;
                    }
                } else {
                    i += 1;
                }
            } else if (c1=='l') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (c2=='j') {
                    i += 2;
                } else {
                    i += 1;
                }
            } else if (c1=='n') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (c2=='j') {
                    i += 2;
                } else {
                    i += 1;
                }
            } else if (c1=='s') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (c2=='=') {
                    i += 2;
                } else {
                    i += 1;
                }
            } else if (c1=='z') {
                if (i<input.length()-1) {
                    c2 = input.charAt(i+1);
                }
                if (c2=='=') {
                    i += 2;
                } else {
                    i += 1;
                }
            } else {
                i += 1;
            }
            cnt++;
            if (flag) break;
        }
        System.out.println(cnt);
    }
}
