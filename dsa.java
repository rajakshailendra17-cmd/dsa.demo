import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        long val1 = sc.nextLong();
        long val2 = sc.nextLong();
        double val3 = (double) val1 / val2;

        System.out.println("floor " + val1 + " / " + val2 + " = " + (long) Math.floor(val3));
        System.out.println("ceil " + val1 + " / " + val2 + " = " + (long) Math.ceil(val3));
        System.out.println("round " + val1 + " / " + val2 + " = " + Math.round(val3));

        sc.close();

    }
}
