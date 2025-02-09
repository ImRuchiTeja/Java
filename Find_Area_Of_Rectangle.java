package Java;

import java.util.Scanner;

public class Find_Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Find Area and perimeter of a rectangle");
        System.out.println("Enter the length of the Rectangle: ");
        float l = in.nextFloat();
        System.out.println("Enter the breadth of the Rectangle: ");
        float b = in.nextFloat();
        System.out.print("The area of the Rectangle is: ");
        System.out.println(Area_of_Rectangle(l,b));
        System.out.print("The perimeter of the rectangle is: ");
        System.out.println(Perimeter_of_Rectangle(l,b));
    }
    static float Area_of_Rectangle(float l, float b){
        if (l<=0 || b<=0){
            return -1;
        }
        return l*b;
    }
    static float Perimeter_of_Rectangle(float l, float b){
        if (l<=0 || b<=0){
            return -1;
        }
        return 2*(l+b);
    }
}
