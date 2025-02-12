package Java;

public class _11_Factorial {
    public static void main(String[] args) {
        int x = 5;
        int result = 1;
        for(int i =x; i>0; i--){
            result *= i;
        }
        System.out.println(result);
    }
}
