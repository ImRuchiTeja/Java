package Java;

import java.util.Scanner;

public class _6_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.length()>1){
            System.out.println("Enter a valid character");
        }else {
            char x = str.toLowerCase().charAt(0);
            vowelOrConsonant(x);
        }
    }
    static void vowelOrConsonant(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println("It is a Vowel");
        }else {
            System.out.println("It is a Consonant");
        }
    }
}
