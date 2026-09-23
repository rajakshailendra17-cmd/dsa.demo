import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given a number N and an array A of N numbers. Print the absolute summation of
        // these numbers.

        int N = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
        }

        System.out.println(Math.abs(sum));
        sc.close();
    }
}
