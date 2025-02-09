package Java;

import java.util.Scanner;

public class _1_Find_ASCII_Value_Of_Character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String str = in.next();
        char x = str.charAt(0);
        findAscii(x);
    }
    static void findAscii(int x){
        System.out.println(x);
    }
}
