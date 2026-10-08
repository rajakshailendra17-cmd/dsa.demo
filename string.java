
// Given two strings S and T. Print 2 lines that contain the following in the same order:
// Print the length of S and T separated by space.
// Print a new string that contains S and T separated by a space.

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String S = sc.nextLine();
            if (S.length() > 10) {

                System.out.println("" + S.charAt(0) + (S.length() - 2) + S.charAt(S.length() - 1));

            } else {

                System.out.println(S);
            }
        }
        sc.close();
    }
}

// Given a string S. Print the summation of its digits.
// String S = sc.nextLine();
// int sum = 0;
// for (int i = 0; i < S.length(); i++) {
// char c = S.charAt(i);
// if (Character.isDigit(c)) {
// sum += Character.getNumericValue(c);
// }
// }
// System.out.println(sum);
// sc.close();
// }
// }

// String S = sc.nextLine();
// String T = sc.nextLine();
// System.out.println(S.length() + " " + T.length());
// System.out.println(S + T);
// // i want to exchange the first character of S with the first character of T
// and
// // print the new strings in a single line separated by space.
// String s = T.charAt(0) + S.substring(1);
// String t = S.charAt(0) + T.substring(1);
// System.out.println(s + " " + t);
// // Given two strings X and Y . Print the smallest lexicographical one.
// // String X = sc.next();
// // String Y = sc.next();

// // if (X.compareTo(Y) <= 0) {
// // System.out.println(X);
// // } else {
// // System.out.println(Y);
// // }
// sc.close();
// }
// }

// // Read the entire line (like getline in C++)
// String S = sc.nextLine();

// // Find the position of the first '\' character
// int pos = S.indexOf('\\');

// // Print substring from beginning up to (but not including) '\'
// System.out.println(S.substring(0, pos));

// sc.close();
// }
// }

// // Read two strings
// String S = sc.nextLine();
// String T = sc.nextLine();

// // Print lengths of S and T
// System.out.println(S.length() + " " + T.length());

// // Print concatenated string with space
// System.out.println(S + " " + T);

// sc.close();
// }
// }
