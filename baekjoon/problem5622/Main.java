package problem5622;

import java.util.Scanner;

public class Main {
    public static String[] data = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    public static int getCharValue(char c) {
        int value = 0;
        int strIndex = 0;
        int charIndex = 0;
        for (int i=0; i<data.length; i++) {
            charIndex = data[i].indexOf(c);
            if (charIndex!=-1) {
                strIndex = i;
                break;
            }
        }
        if (charIndex==-1) value = 11;
        else value = strIndex+3;
        return value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i=0; i<input.length(); i++) {
            sum += getCharValue(input.charAt(i));
        }
        System.out.println(sum);
    }
}
