
import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] freq = new int[M + 1];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            freq[x]++;
        }

        // print frequencies for numbers 1..M
        for (int i = 1; i <= M; i++) {
            System.out.println(freq[i]);
        }

        sc.close();
    }
}
