public class add_two_matrix {
    public static void main(String[] args) throws Exception {

        int[][] matrix_1 = {
                { 1, 2, 3, 4 },
                { 4, 2, 3, 1 },
                { 2, 2, 2, 2 }
        };
        int[][] matrix_2 = {
                { 3, 3, 3, 3 },
                { 1, 3, 5, 7 },
                { 6, 9, 9, 6 }
        };
        int row = matrix_1.length;
        int col = matrix_1[0].length;
        int[][] sum_matrix = new int[row][col];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                sum_matrix[r][c] = matrix_1[r][c] + matrix_2[r][c];
            }
        }

        System.out.println("First matrix:");
        print2dArray(matrix_1);
        System.out.println("Second matrix:");
        print2dArray(matrix_2);
        System.out.println("Sum of matrices:");
        print2dArray(sum_matrix);
    }

    static void print2dArray(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
