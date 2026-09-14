import java.util.Scanner;
//import java.util.Arrays;

public class dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find the price before adding the discount on it.
        double discount = sc.nextDouble();
        double discounted_price = sc.nextDouble();
        double price = discounted_price / (1 - (discount / 100));

        System.out.printf("%.2f", price);
        sc.close();

        // // Given 4 numbers A,B,C and D. If A^B > C^D print "YES" otherwise, print
        // "NO".

        // long A = sc.nextLong();
        // long B = sc.nextLong();
        // long C = sc.nextLong();
        // long D = sc.nextLong();

        // double left = B * Math.log(A);
        // double right = D * Math.log(C);

        // if (left > right) {
        // System.out.println("YES");
        // } else {
        // System.out.println("NO");
        // }

        // Given 4 numbers A B C and D. Print the last 2 digits from their
        // Multiplication.

        // long A = sc.nextLong();
        // long B = sc.nextLong();
        // long C = sc.nextLong();
        // long D = sc.nextLong();

        // long ans = ((A % 100) * (B % 100) * (C % 100) * (D % 100)) % 100;

        // System.out.printf("%02d%n", ans);

        // Given 4 numbers

        // long l1 = sc.nextLong();
        // long r1 = sc.nextLong();
        // long l2 = sc.nextLong();
        // long r2 = sc.nextLong();

        // long start = Math.max(l1, l2);
        // long end = Math.min(r1, r2);

        // if (start <= end) {
        // System.out.println(start + " " + end);
        // } else {
        // System.out.println(-1);
        // }

        // Given a mathematical expression. The expression will be one of the following
        // expressions:

        // A + B = C, A - B = C and A * B = C

        // int A = sc.nextInt();
        // String S = sc.next();
        // int B = sc.nextInt();
        // sc.next();
        // int C = sc.nextInt();

        // int result = 0;
        // if (S.equals("+"))
        // result = A + B;
        // else if (S.equals("-"))
        // result = A - B;
        // else if (S.equals("*"))
        // result = A * B;

        // if (result == C) {
        // System.out.println("Yes");
        // } else {
        // System.out.println(result);
        // }

        // Given a comparison symbol S between two numbers A and B. Determine whether it
        // is Right or Wrong.
        // The comparison is as follows: A < B, A > B, A = B.
        // Where A, B are two integer numbers and S refers to the sign between them.

        // String input = sc.nextLine().replaceAll("\\s+", "");
        // char operator = ' ';
        // int index = -1;
        // for (int i = 0; i < input.length(); i++) {
        // char c = input.charAt(i);
        // if (c == '<' || c == '>' || c == '=') {
        // operator = c;
        // index = i;
        // break;
        // }
        // }

        // long A = Long.parseLong(input.substring(0, index));
        // long B = Long.parseLong(input.substring(index + 1));

        // long result = 0;
        // switch (operator) {
        // case '<':
        // result = A < B ? 1 : 0;
        // break;
        // case '>':
        // result = A > B ? 1 : 0;
        // break;
        // case '=':
        // result = A == B ? 1 : 0;
        // break;
        // default:
        // System.out.println("Invalid operator");
        // break;

        // }

        // if (result == 1)
        // System.out.println("Right");
        // else
        // System.out.println("Wrong");

        // Given a number N
        // Determine whether N
        // is float number or integer number
        // String input = sc.nextLine();

        // if (input.contains(".")) {
        // String[] parts = input.split("\\.");

        // if (parts[1].matches("0+")) {
        // System.out.println("int " + parts[0]);
        // } else {
        // System.out.println("float " + parts[0] + " " + "0." + parts[1]);
        // }
        // } else {
        // System.out.println("int " + input);
        // }

        // Given three numbers A, B, C. Print these numbers in ascending order followed
        // by a blank line and then the values in the sequence as they were read.
        // long A = sc.nextLong();
        // long B = sc.nextLong();
        // long C = sc.nextLong();
        // long[] arr = { A, B, C };
        // Arrays.sort(arr);

        // for (int i = 0; i < 3; i++) {
        // System.out.print(arr[i] + " ");
        // System.out.println();

        // }
        // System.out.println();

        // System.out.println(A);
        // System.out.println(B);
        // System.out.println(C);

        // double X = sc.nextDouble();

        // if (X >= 0 && X <= 25)
        // System.out.println("Interval [0,25]");
        // else if (X > 25 && X <= 50)
        // System.out.println("Interval (25,50]");
        // else if (X > 50 && X <= 75)
        // System.out.println("Interval (50,75]");
        // else if (X > 75 && X <= 100)
        // System.out.println("Interval (75,100]");
        // else
        // System.out.println("Out of Intervals");

        // long N = sc.nextLong();
        // long years = N / 365;
        // N = N % 365;
        // long months = N / 30;
        // N = N % 30;
        // long days = N;
        // System.out.println(years + " " + "years");
        // System.out.println(months + " " + "months");
        // System.out.println(days + " " + "days");

        // double X = sc.nextDouble();
        // double Y = sc.nextDouble();
        // if (X > 0 && Y > 0) {
        // System.out.println("Q1");
        // } else if (X < 0 && Y > 0) {
        // System.out.println("Q2");
        // } else if (X < 0 && Y < 0) {
        // System.out.println("Q3");
        // } else if (X > 0 && Y < 0) {
        // System.out.println("Q4");
        // } else if (X == 0 && Y == 0) {
        // System.out.println("Origem");
        // } else if (X == 0) {
        // System.out.println("Eixo Y");
        // } else if (Y == 0) {
        // System.out.println("Eixo X");
        // }

        // char firstDigit = sc.next().charAt(0);
        // int digit = firstDigit - '0';

        // if (digit % 2 == 0) {
        // System.out.println("EVEN");
        // } else {
        // System.out.println("ODD");
        // }

        // String input = sc.next();

        // char operator = ' ';
        // int index = -1;
        // for (int i = 0; i < input.length(); i++) {
        // char c = input.charAt(i);
        // if (c == '+' || c == '-' || c == '*' || c == '/') {
        // operator = c;
        // index = i;
        // break;
        // }
        // }

        // long A = Long.parseLong(input.substring(0, index));
        // long B = Long.parseLong(input.substring(index + 1));

        // long result = 0;
        // switch (operator) {
        // case '+':
        // result = A + B;
        // break;
        // case '-':
        // result = A - B;
        // break;
        // case '*':
        // result = A * B;
        // break;
        // case '/':
        // result = A / B;
        // break;
        // }

        // System.out.println(result);

        // long A = sc.nextLong();

        // if (S == '+') {
        // System.out.println(A + B);
        // } else if (S == '-') {
        // System.out.println(A - B);
        // } else if (S == '*') {
        // System.out.println(A * B);
        // } else if (S == '/') {
        // System.out.println(A / B);
        // } else {
        // System.out.println("Invalid Operator");
        // }
        // char X = sc.next().charAt(0);
        // if (Character.isLowerCase(X)) {
        // X = Character.toUpperCase(X);
        // System.out.println(X);
        // } else {
        // X = Character.toLowerCase(X);
        // System.out.println(X);
        // }
        // if (Character.isDigit(X)) {
        // System.out.println("IS DIGIT");
        // } else if (Character.isAlphabetic(X) && Character.isUpperCase(X)) {
        // System.out.println("ALPHA");
        // System.out.println("IS CAPITAL");
        // } else {
        // System.out.println("ALPHA");
        // System.out.println("IS SMALL");
        // }

        // String F1 = sc.next();
        // String S1 = sc.next();

        // String F2 = sc.next();
        // String S2 = sc.next();
        // if (S1.equals(S2)) {
        // System.out.println("Are Brothers");
        // } else {
        // System.out.println("Not");
        // }

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

    }

}
