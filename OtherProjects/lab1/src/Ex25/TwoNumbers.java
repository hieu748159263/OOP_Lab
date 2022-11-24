package Ex25;

import javax.swing.JOptionPane;

public class TwoNumbers {
    public static void main(String[] args) {
        Double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the first number:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the second number:"));

        Double sum = num1 + num2;
        Double diff = num1 - num2;
        Double product = num1 * num2;
        String msg = String.format("Numbers inputted: %f and %f\n"
                + "Sum: %.2f\n"
                + "Difference: %.2f\n"
                + "Product: %.2f\n", num1, num2, sum, diff, product);

        if (num2 == 0) {
            msg += "Can't devide when divisor is zero!";
        } else {
            msg += String.format("Quotient: %.2f", num1 / num2);
        }

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
