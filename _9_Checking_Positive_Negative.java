package Java;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class _9_Checking_Positive_Negative {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        checkSign(a);
    }
    static void checkSign(int a){
        if (a>0){
            System.out.println("It is a positive integer");
        } else if (a<0) {
            System.out.println("It is a negative integer");
        }else {
            System.out.println("0, It is neither negative nor positive integer");
        }
    }
}
