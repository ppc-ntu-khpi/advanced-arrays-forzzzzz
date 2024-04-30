## Завдання
Заповнити квадратну матрицю заданого порядку N числами в порядку зростання, починаючи з заданого числа x, наприклад (для N=3, x=14),
```
[14,15,16]
[17,18,19]
[20,21,22]
```

## Код
### Клас Matrix
``` java
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
```

Я знаю, що не використав більше пожливостей класу Arrays, але я не знаю, як це можно було зробити не вористовуючи "костелі".


### Клас Main
``` java
public class Main {
    public static void main(String[] args) {

        int n = 5;
        int x = 3;

        Matrix matrix = new Matrix(n);

        matrix.fillMatrix(x);
        matrix.printMatrix();
    }
}
```

### Результат
```
[3, 4, 5, 6, 7]
[8, 9, 10, 11, 12]
[13, 14, 15, 16, 17]
[18, 19, 20, 21, 22]
[23, 24, 25, 26, 27]

Process finished with exit code 0
```

#### Дякую за увагу! Усього найкращого :kissing_heart:
