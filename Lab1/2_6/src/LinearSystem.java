import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {

        // Program to solve system of first-degree equations
        // a11x1 + a12x2 = b1
        // a21x1 + a22x2 = b2

        Scanner oScanner = new Scanner(System.in);
        System.out.print("a11 = ");
        Double a11 = oScanner.nextDouble();
        System.out.print("a12 = ");
        Double a12 = oScanner.nextDouble();
        System.out.print("b1 = ");
        Double b1 = oScanner.nextDouble();
        System.out.print("a21 = ");
        Double a21 = oScanner.nextDouble();
        System.out.print("a22 = ");
        Double a22 = oScanner.nextDouble();
        System.out.print("b2 = ");
        Double b2 = oScanner.nextDouble();
        oScanner.close();

        // Calculate determinants
        double D = calc_determinant(a11, a12, a21, a22);
        double D1 = calc_determinant(b1, a12, b2, a22);
        double D2 = calc_determinant(a11, b1, a21, b2);

        // Evaluate results
        if (D == 0){
            if (D1 == 0 && D2 == 0){
                System.out.println("Infinite solutions!");
            }else{
                System.out.println("No solution!");
            }
        }else{
            System.out.format("x1 = %.2f\n", D1/D);
            System.out.format("x2 = %.2f\n", D2/D);
        }

        System.exit(0);
    }

    // Determinant of 2x2 matrix
    static double calc_determinant(double a, double b, double c, double d) {
        return a * d - b * c;
    }
}
