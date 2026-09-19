import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
            System.out.print(fibo(i) + " ");

        System.out.println();

        sc.close();
    }

    public static int fibo(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return fibo(N - 1) + fibo(N - 2);
    }
}

// Given a number N. Print first N numbers of the Fibonacci sequence.
// int N = sc.nextInt();
// int a = 0;
// int b = 1;
// for (int i = 0; i < N; i++) {
// System.out.print(a + " ");
// int c = a + b;
// a = b;
// b = c;
// }

// int T = sc.nextInt();
// for (int t = 0; t < T; t++) {
// int N = sc.nextInt();
// int onesCount = 0;
// int temp = N;
// while (temp > 0) {
// if (temp % 2 == 1) {
// onesCount++;
// }
// temp = temp / 2;
// }
// int result = 0;
// for (int i = 0; i < onesCount; i++) {
// result = result + (int) Math.pow(2, i) * 1;
// }
// System.out.println(result);
// }

// Given a number N. Print a diamond that has 2N rows.using * sign.
// int N = sc.nextInt();
// for (int i = 1; i <= N; i++) {
// String spaces = " ".repeat(N - i);
// String stars = "*".repeat(2 * i - 1);
// System.out.println(spaces + stars);
// }

// for (int i = N; i >= 1; i--) {
// String spaces = " ".repeat(N - i);
// String stars = "*".repeat(2 * i - 1);
// System.out.println(spaces + stars);
// }

// Given a number N. Print N lines that describes PUM game.
// int N = sc.nextInt();
// int num = 1;
// for (int i = 1; i <= N; i++) {
// System.out.print(num + " ");
// System.out.print((num + 1) + " ");
// System.out.print((num + 2) + " ");
// System.out.println("PUM");
// num = num + 4;
// }

// Given three numbers N, A, B. Print the summation of the numbers between 1 and
// N whose sum of digits is between A and B inclusive.
// int N = sc.nextInt();
// int A = sc.nextInt();
// int B = sc.nextInt();
// long total = 0;

// for (int i = 1; i <= N; i++) {
// int sum = 0;
// int x = i;
// while (x > 0) {
// sum += x % 10;
// x /= 10;
// }
// if (sum >= A && sum <= B) {
// total += i;
// }
// }

// System.out.println(total);

// Given a number N. Print a pyramid that has N rows.
// int N = sc.nextInt();
// for (int i = 1; i <= N; i++) {
// for (int j = 1; j <= N - i; j++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= 2 * i - 1; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// Given two numbers X and Y. Print the sum of all odd numbers between them,
// excluding X and Y.
// int T = sc.nextInt();
// for (int i = 0; i < T; i++) {
// int X = sc.nextInt();
// int Y = sc.nextInt();
// int sum = 0;
// int start = Math.min(X, Y);
// int end = Math.max(X, Y);
// for (int j = start + 1; j < end; j++) {
// if (j % 2 != 0)
// sum += j;
// }
// System.out.println(sum);

// }

// while (true) {
// int N = sc.nextInt();
// int M = sc.nextInt();
// if (N <= 0 || M <= 0) {
// break;
// }
// int start = Math.min(N, M);
// int end = Math.max(N, M);

// int sum = 0;
// for (int i = start; i <= end; i++) {
// System.out.print(i + " ");
// sum += i;
// }
// System.out.println("sum =" + sum);
// }

// Given a number N. Print the digits of that number from right to left
// separated by space, take T input as a testcase.
// int T = sc.nextInt();
// for (int i = 0; i < T; i++) {
// int N = sc.nextInt();
// do {
// int digit = N % 10;
// System.out.print(digit + " ");
// N = N / 10;
// } while (N != 0);
// System.out.println();

// }

// Given a number N. Print a face down right angled triangle that has N rows.
// int N = sc.nextInt();
// for (int i = N; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();

// }

// Given a number N. Print a left angled triangle that has N rows
// with the symbol *.
// int N = sc.nextInt();
// for (int i = 1; i <= N; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");

// }
// System.out.println();

// }

// For each number Xi in the N numbers print a new line that contains the symbol
// repeated Xi time.
// char S = sc.next().charAt(0);
// int N = sc.nextInt();
// int[] arr = new int[N];
// for (int i = 0; i <= N - 1; i++) {
// arr[i] = sc.nextInt();
// for (int j = 0; j < arr[i]; j++)
// System.out.print(S);
// System.out.println();

// }

// int A = sc.nextInt();
// int B = sc.nextInt();
// boolean found = false;
// for (int num = A; num <= B; num++) {
// int temp = num;
// boolean isLucky = true;
// while (temp > 0) {
// int digit = temp % 10;
// if (digit != 4 && digit != 7) {
// isLucky = false;
// break;
// }
// temp /= 10;
// }

// if (isLucky) {
// System.out.print(num + " ");
// found = true;
// }
// }

// if (!found) {
// System.out.println(-1);
// }

// Given two numbers A and B. Print the greatest common divisor between (A, B).
// int A = sc.nextInt();
// int B = sc.nextInt();
// int gcd = 1;
// int max_gcd = 0;
// for (int i = 1; i <= Math.min(A, B); i++) {
// if (A % i == 0 && B % i == 0) {
// gcd = i;
// }
// max_gcd = Math.max(max_gcd, gcd);

// }
// System.out.println(max_gcd);

// Given a number N. Print all the divisors of N in ascending order.
// int N = sc.nextInt();
// for (int i = 1; i <= N; i++) {
// if (N % i == 0) {
// System.out.println(i);

// }

// }

// print all prime number from 1 to N.
// int N = sc.nextInt();

// for (int num = 2; num <= N; num++) {
// boolean isPrime = true;

// for (int i = 2; i <= num / 2; i++) {
// if (num % i == 0) {
// isPrime = false;
// break;
// }
// }

// if (isPrime) {
// System.out.print(num + " ");
// }
// }

// check pallindrom
// int N = sc.nextInt();
// int original = N;
// int reversed = 0;

// while (N > 0) {
// int digit = N % 10;
// reversed = reversed * 10 + digit;
// N = N / 10;
// }
// System.out.println(reversed);
// if (original == reversed) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }

// Given a number X. Determine if the number is prime or not.

// int X = sc.nextInt();
// int prime = 1;

// if (X <= 1) {
// prime = 0;
// } else {
// for (int i = 2; i * i <= X; i++) {
// if (X % i == 0) {
// prime = 0;
// break;
// }
// }
// }

// if (prime==1) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }

// Given a number N. Print the factorial of number N.InputFirst line contains a
// number T (1 ≤ T ≤ 15) number of test cases.Next T lines will contain a number
// N (0 ≤ N ≤ 20).
// int T = sc.nextInt();
// for(int i=0;i<T;i++){
// int N = sc.nextInt();
// long fact = 1;
// for(int j = 1;j<=N;j++){
// fact =
// fact*j;
// }
// System.out.println(fact);

// }

// Given a number N. Print the maltiplication table of the number from 1 to 12.
// int N = sc.nextInt();
// for(int i=1;i<=12;i++){
// System.out.println(N+" "+"*"+" "+i+" "+"="+" "+N*i);

// }

// Given a number N, and N numbers, find maximum number in these N numbers.

// int N = sc.nextInt();
// int[] arr = new int[N];
// for(int i=0;i<N;i++){
// arr[i] = sc.nextInt();

// }
// int max = arr[0];
// for(int i=0;i<N;i++){
// if(arr[i]>max){
// max = arr[i];

// }
// }
// System.out.println(max);

// Given multiple lines each line contains a number X which is a password. Print
// "Wrong" if the password is incorrect otherwise, print "Correct" and terminate
// the program.
// Note: The "Correct" password is the number 1999

// while(sc.hasNextInt()){
// int X = sc.nextInt();
// if(X==1999){
// System.out.println("Correct");
// break;
// }
// else{
// System.out.println("Wrong");
// }

// }

// Given N numbers. Count how many of these values are even, odd, positive and
// negative.
// int N = sc.nextInt();
// int i = 1;
// int even = 0;
// int odd = 0;
// int positive = 0;
// int negative = 0;
// while(i<=N){
// int num = sc
// .nextInt();
// if(num%2==0){
// even++;

// }
// if(num%2!=0){
// odd++;

// }
// if(num>0){
// positive++;

// }
// if(num<0){
// negative++;

// }
// i++;

// }
// System.out.println("Even:"+" "+even);
// System.out.println("Odd:"+" "+odd);
// System.out.println("Positive:"+" "+positive);
// System.out.println("Negative:"+" "+negative);

// print all even number from 1 to N and print -1 if there is no even number.
// int N = sc.nextInt();
// int i = 2;
// while(i<=N){
// System.out.println(i);
// i = i+2;

// }

// if(i==2){
// System.out.println(-1);

// }

// int N = sc.nextInt();
// int i = 1;
// while(i<=N){
// System.out.println(i);
// i++;

// }
