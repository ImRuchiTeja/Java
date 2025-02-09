package Java;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        checkEvenorOdd(a);
    }
    static void checkEvenorOdd(int a){
        if(a%2==0){
            System.out.println("It is an Even number");
        }else {
            System.out.println("It is an Odd number");
        }
    }
}
