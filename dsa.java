import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long sum;
        sum = (N % 10) + (M % 10);
        System.out.println(sum);

        sc.close();

    }
}
