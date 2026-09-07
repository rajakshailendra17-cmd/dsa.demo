import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // int a = 10;
        // int b = 20;
        // int sum = a + b;
        // System.out.println("Sum of a and b is: " + sum);
        String name = "programmer";
        System.out.println("Hello, " + name);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        char c = sc.next().charAt(0);
        float d = sc.nextFloat();
        double e = sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        sc.close();

    }
}
