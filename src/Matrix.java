import java.util.Arrays;

/**
 * Клас для представлення та роботи з квадратною матрицею.
 */
public class Matrix {
    private int[][] matrix;

    /**
     * Конструктор класу.
     *
     * @param N порядок квадратної матриці
     */
    public Matrix(int N) {
        matrix = new int[N][N];
    }

    /**
     * Заповнює матрицю починаючи з числа x.
     *
     * @param x початкове число для заповнення матриці
     */
    public void fillMatrix(int x) {
        int current = x;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = current;
                current++;
            }
        }
    }

    /**
     * Виводить матрицю на екран.
     */
    public void printMatrix() {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
