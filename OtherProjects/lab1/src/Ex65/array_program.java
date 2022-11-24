package Ex65;
import java.util.Arrays;

public class array_program {
    public static void main(String[] args) throws Exception {
        // sort a numeric array
        // and calculate the sum and average value of array elements.
        int[] iArray = { 1789, 2035, 1899, 1456, 2013, 2002 };
        Arrays.sort(iArray);
        int sum = 0;
        for (int i : iArray) {
            sum += i;
        }
        double avg = sum / iArray.length;

        // Print the array, sum and avg
        System.out.print("Sorted array: ");
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.format("\nArray sum: %d\n" +
                "Average value: %.2f", sum, avg);
    }
}
