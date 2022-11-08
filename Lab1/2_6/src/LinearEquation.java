import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {

        Scanner oScanner = new Scanner(System.in);
        System.out.print("a = ");
        Double a = oScanner.nextDouble();
        System.out.print("b = ");
        Double b = oScanner.nextDouble();
        oScanner.close();

        if (b == 0) {
            System.out.println("No solution!");
        } else {
            System.out.println("x = %.2f".formatted(-b / a));
        }

        System.exit(0);
    }
}
