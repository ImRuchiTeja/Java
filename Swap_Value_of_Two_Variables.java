package Java;

public class Swap_Value_of_Two_Variables {
    public static void main(String[] args) {
        int a = 15;
        int b = 18;
        System.out.printf("Before Swapping a = %d, b = %d", a, b);
        System.out.println();
        // We cannot use swap as a separate method because in Java, There is only pass by Value
        int temp = a;
        a=b;
        b=temp;
        System.out.printf("After Swapping a = %d, b = %d", a, b);
    }

}
