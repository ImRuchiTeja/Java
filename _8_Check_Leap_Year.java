package Java;

import java.util.Scanner;

public class _8_Check_Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter an year: ");
        Scanner in = new Scanner(System.in);
        int Year = in.nextInt();
        if(Year>0){
            if((Year%4==0)&&(Year%100!=100||Year%400==0)){
                System.out.println("It is a Leap Year");
            }else{
                System.out.println("It is not a leap Year");
            }
        }
    }
}
