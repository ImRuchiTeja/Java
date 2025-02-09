package Java;

public class _7_Find_Largest_Among_Three_Nums {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 4;
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else{
            max = c;
        }
        System.out.println(max);

    }
}