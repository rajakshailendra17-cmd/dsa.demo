import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) {
                count++;
            }

        }
        int op = 0;
        while (count == N) {
            for (int i = 0; i < N; i++) {
                A[i] /= 2;
            }
            count = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 == 0) {
                    count++;
                }
            }
            op++;

        }
        System.out.println(op);
    }
}
// int N = sc.nextInt();
// sc.close();

// System.out.println(fib(N));
// }

// public static long fib(int n) {
// if (n == 1)
// return 0;
// if (n == 2)
// return 1;

// long a = 0, b = 1, c = 0;
// for (int i = 3; i <= n; i++) {
// c = a + b;
// a = b;
// b = c;
// }
// return b;
// }
// }

// Replace minmax.
// int N = sc.nextInt();
// int[] A = new int[N];
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// int index1 = 0;
// int index2 = 0;
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// if (A[i] > max) {
// max = A[i];
// index1 = i;

// }
// if (A[i] < min) {
// min = A[i];
// index2 = i;

// }
// }
// A[index1] = A[index2];
// A[index2] = max;
// for (int i = 0; i < N; i++) {
// System.out.print(A[i] + " ");
// }
// find contiguous subarray with maximum number in that subarray.
// int T = sc.nextInt();

// while (T-- > 0) {
// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }
// for (int i = 0; i < N; i++) {
// int max = A[i];
// for (int j = i; j < N; j++) {
// if (A[j] > max) {
// max = A[j];
// }
// System.out.print(max + " ");
// }
// }
// System.out.println();
// }

// Given a number N and an array A of N digits (not separated by space). Print
// the summation of these digits.
// int N = sc.nextInt();
// String digits = sc.next();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = digits.charAt(i) - '0';
// }
// int sum = 0;
// for (int i = 0; i < N; i++) {
// sum += A[i];
// }
// System.out.println(sum);

// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();

// }
// int min = Integer.MAX_VALUE;
// for (int i = 0; i < N; i++) {
// if (A[i] < min) {
// min = A[i];
// }

// }
// int count = 0;
// for (int i = 0; i < N; i++) {
// if (min == A[i]) {
// count++;
// }
// }
// if (count % 2 != 0) {
// System.out.println("Lucky");
// } else {
// System.out.println("Unlucky");
// }

// Given a number N and an array A of N numbers. Print the smallest possible
// result of Ai + Aj + j - i , where 1 ≤ i < j ≤ N.
// int T = sc.nextInt();
// for (int i = 0; i < T; i++) {
// int N = sc.nextInt();
// int[] A = new int[N];
// for (int j = 0; j < N; j++) {
// A[j] = sc.nextInt();

// }
// int min = Integer.MAX_VALUE;
// for (int j = 1; j <= N; j++) {
// for (int k = j + 1; k <= N; k++) {
// if (j != k) {
// int sum = A[j - 1] + A[k - 1];
// int diff = k - j;
// int result = sum + diff;
// if (result < min) {
// min = result;

// }
// }
// }
// }
// System.out.println(min);
// }

// sorting using bubble sort.
// int N = sc.nextInt();
// int[] A = new int[N];

// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }
// for (int i = 0; i < N - 1; i++) {
// for (int j = 0; j < N - 1 - i; j++) {
// if (A[j] > A[j + 1]) {
// int temp = A[j];
// A[j] = A[j + 1];
// A[j + 1] = temp;
// }
// }
// }

// for (int i = 0; i < N; i++) {
// System.out.print(A[i] + " ");
// }

// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }

// boolean isPalindrome = true;
// for (int i = 0; i < N / 2; i++) {
// if (A[i] != A[N - 1 - i]) {
// isPalindrome = false;
// break;
// }
// }

// if (isPalindrome) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }

// Given a number N and an array A of N numbers. Print the lowest number and its
// position.
// Note: if there are more than one answer print first one's position.
// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();

// }
// int min = A[0];
// int minIndex = 0;
// for (int i = 0; i < N; i++) {
// if (A[i] < min) {
// min = A[i];
// minIndex = i;

// }
// }
// System.out.println(min + " " + (1 + minIndex));

// int T = sc.nextInt();
// while (T >0) {
// int n = sc.nextInt();
// long s = sc.nextLong();

// long maxSum = (long)n * (n + 1) / 2;

// if (s > maxSum) {
// System.out.println(-1);
// continue;
// }

// long sum = 0;
// StringBuilder ans = new StringBuilder();
// for (int i = n; i >= 1; i--) {
// if (sum + i <= s) {
// sum += i;
// ans.append(i).append(" ");
// }
// if (sum == s) break;
// }

// if (sum == s) {
// System.out.println(ans.toString().trim());
// } else {
// System.out.println(-1);
// }
// T--;
// }
// }
// }

// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++)
// A[i] = sc.nextInt();
// for (int i = 0; i < N; i++) {
// if (A[i] <= 10) {
// System.out.println("A[" + i + "]" + " " + "=" + " " + A[i]);
// }
// }
// sc.close();

// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }
// for (int i = 0; i < N; i++) {
// if (A[i] > 0) {
// A[i] = 1;
// } else if (A[i] < 0) {
// A[i] = 2;
// } else {
// A[i] = A[i];
// }
// }

// for (int i = 0; i < N; i++) {
// System.out.print(A[i] + " ");
// }

// Given a number N and an array A of N numbers. Determine if the number X
// exists in array A or not and print its position (0-index).

// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }
// int X = sc.nextInt();
// int i;
// int count = 0;
// for (i = 0; i < N; i++) {
// if (A[i] == X) {
// System.out.println(i);
// count = 1;
// break;
// }

// }
// if (count == 0) {
// System.out.println(-1);

// }

// Given a number N and an array A of N numbers. Print the absolute summation of
// these numbers.

// int N = sc.nextInt();
// long sum = 0;

// for (int i = 0; i < N; i++) {
// sum += sc.nextInt();
// }

// System.out.println(Math.abs(sum));
