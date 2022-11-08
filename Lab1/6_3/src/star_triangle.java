import java.util.*;

public class star_triangle {
    public static void main(String[] args) throws Exception {
        Scanner oScanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = oScanner.nextInt();
        oScanner.close();

        if (n < 0)
            throw new InputMismatchException("n has to be positive");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
