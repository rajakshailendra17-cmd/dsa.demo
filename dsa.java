import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String F1 = sc.next();
        String S1 = sc.next();

        String F2 = sc.next();
        String S2 = sc.next();
        if (S1.equals(S2)) {
            System.out.println("Are Brothers");
        } else {
            System.out.println("Not");
        }

        // long A = sc.nextLong();
        // long B = sc.nextLong();
        // long C = sc.nextLong();
        // long max;
        // long min;
        // if (A % B == 0 && B != 0) {
        // System.out.println("Multiples");
        // } else if (B % A == 0 && A != 0) {
        // System.out.println("Multiples");
        // } else {
        // System.out.println("No Multiples");
        // }
        // if (A > B && A > C) {
        // max = A;
        // } else {
        // if (B > C) {
        // max = B;
        // } else {
        // max = C;
        // }
        // }
        // if (A < B && A < C) {
        // min = A;
        // } else {
        // if (B < C) {
        // min = B;
        // } else {
        // min = C;
        // }
        // }
        // System.out.println(min + " " + max);
        // if (A >= B) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // long N = sc.nextLong();
        // long M = sc.nextLong();
        // long sum;
        // sum = (N % 10) + (M % 10);
        // System.out.println(sum);
        // long N = sc.nextLong();
        // long sum = 0;
        // sum = N * (N + 1) / 2;
        // System.out.println(sum);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int sum = A / B;
        // System.out.println("floor" + " " + (int) Math.floor(sum));
        // System.out.println("ceil" + " " + (int) Math.ceil(sum));
        // System.out.println("round" + " " + (int) Math.round(sum));

        // long val1 = sc.nextLong();
        // long val2 = sc.nextLong();
        // double val3 = (double) val1 / val2;

        // System.out.println("floor " + val1 + " / " + val2 + " = " + (long)
        // Math.floor(val3));
        // System.out.println("ceil " + val1 + " / " + val2 + " = " + (long)
        // Math.ceil(val3));
        // System.out.println("round " + val1 + " / " + val2 + " = " +
        // Math.round(val3));

        sc.close();
    }

}
