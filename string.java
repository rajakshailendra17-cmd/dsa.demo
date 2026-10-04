
// Given two strings S and T. Print 2 lines that contain the following in the same order:
// Print the length of S and T separated by space.
// Print a new string that contains S and T separated by a space.

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the entire line (like getline in C++)
        String S = sc.nextLine();

        // Find the position of the first '\' character
        int pos = S.indexOf('\\');

        // Print substring from beginning up to (but not including) '\'
        System.out.println(S.substring(0, pos));

        sc.close();
    }
}

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
