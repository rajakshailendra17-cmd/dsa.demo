
import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mirror 2D array.

        int N = sc.nextInt(); // number of rows
        int M = sc.nextInt(); // number of columns

        long[][] A = new long[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = M - 1; j >= 0; j--) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// int[] freq = new int[M + 1];

// for (int i = 0; i < N; i++) {
// int x = sc.nextInt();
// freq[x]++;
// }

// // print frequencies for numbers 1..M
// for (int i = 1; i <= M; i++) {
// System.out.println(freq[i]);
// }

// sc.close();
// }
// }
