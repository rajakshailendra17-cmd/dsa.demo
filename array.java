import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given a number N and an array A of N numbers. Determine if the number X
        // exists in array A or not and print its position (0-index).

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int i;
        int count = 0;
        for (i = 0; i < N; i++) {
            if (A[i] == X) {
                System.out.println(i);
                count = 1;
                break;
            }

        }
        if (count == 0) {
            System.out.println(-1);

        }

        // Given a number N and an array A of N numbers. Print the absolute summation of
        // these numbers.

        // int N = sc.nextInt();
        // long sum = 0;

        // for (int i = 0; i < N; i++) {
        // sum += sc.nextInt();
        // }

        // System.out.println(Math.abs(sum));
        sc.close();
    }
}
