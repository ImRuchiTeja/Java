package Java;

import java.util.Scanner;

public class _3_Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Celsius");
        float celsius = in.nextFloat();
        double fahrenheit = Celsius_to_Fahrenheit(celsius);
        System.out.printf("%.2f degree Celsius in Fahrenheit is: %.2f degree Fahrenheit", celsius, fahrenheit);
    }
    static double Celsius_to_Fahrenheit(float celsius){
        double fahrenheit = (celsius*1.8)+32;
        return fahrenheit;
    }
}
