import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        int x = 3;

        Matrix matrix = new Matrix(n);

        matrix.fillMatrix(x);
        matrix.printMatrix();
    }
}
