import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        // value a, b, and c
        Scanner oScanner = new Scanner(System.in);
        System.out.print("a = ");
        Double a = oScanner.nextDouble();
        System.out.print("b = ");
        Double b = oScanner.nextDouble();
        System.out.print("c = ");
        Double c = oScanner.nextDouble();
        oScanner.close();

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;
        double x1, x2;

        if (a == 0){
            System.out.println("a cannot be equal to zero!");
            System.exit(-1);
        }
        
        // check if determinant is greater than 0
        if (determinant > 0) {
            // two real and distinct roots
            x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            x2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("x1 = %.2f and x2 = %.2f", x1, x2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            x1 = x2 = -b / (2 * a);
            System.out.format("x1 = x2 = %.2f;", x1);
        }

        // if determinant is less than zero
        else {
            System.out.print("No real solutions!");
            System.exit(0);
        }
    }
}