package Java;

public class _10_Roots_Of_Quadratic_Equation {
    public static void main(String[] args) {
        int a = 1, b= -5, c=6;
        double root1, root2;
        double discriminant = (b*b)-4*(a*c);
        if (discriminant>0){
            root1 = (-b+Math.sqrt(discriminant))/(2*a);
            root2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.printf("Root1: %.2f, Root2: %.2f", root1, root2);
        }
        else if(discriminant==0){
            root1 = root2 = -b / (2*a);
            System.out.printf("Root1: %.2f, Root2: %.2f", root1, root2);
        }
        else {
            double realPart= -b / (2*a);
            double imaginaryPart = Math.sqrt(discriminant)/(2*a);
            System.out.printf("Root1: %.2f, Root2: %.2fi", realPart, imaginaryPart);
        }
    }
}
