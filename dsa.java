import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        String name = "programmer";
        System.out.println("Hello, " + name);
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(X + " + " + Y + " = " + (X + Y));
        System.out.println(X + " * " + Y + " = " + (X * Y));
        System.out.println(X + " - " + Y + " = " + (X - Y));
        // long b = sc.nextLong();
        // char c = sc.next().charAt(0);
        // float d = sc.nextFloat();
        // double e = sc.nextDouble();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);

        sc.close();

    }
}
