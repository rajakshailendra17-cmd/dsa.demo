import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int j = 0; // pointer for B

        for (int i = 0; i < n && j < m; i++) {
            if (A[i] == B[j]) {
                j++;
            }
        }

        if (j == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}