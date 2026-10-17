
// Given two strings S and T. Print 2 lines that contain the following in the same order:
// Print the length of S and T separated by space.
// Print a new string that contains S and T separated by a space.

import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given a string S. For each word in S reverse its letters then print it.
        String S = sc.nextLine();
        S = S.replaceAll("[!.,?]", " ");
        String[] words = S.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            if (i == words.length - 1) {
                System.out.print(reversedWord); // last word → no space
            } else {
                System.out.print(reversedWord + " ");
            }
        }

    }
}

// Given a string S. Print number of words in it.
// String S = sc.nextLine();

// // Replace punctuation with spaces
// S = S.replaceAll("[!.,?]", " ");

// // Split by one or more spaces
// String[] words = S.trim().split("\\s+");

// // Handle empty input case
// if (S.trim().isEmpty()) {
// System.out.println(0);
// } else {
// System.out.println(words.length);
// }
// }
// }
// String s = sc.next();
// String target = "hello";
// int targetIndex = 0;

// // Loop through each character of the input string
// for (int i = 0; i < s.length(); i++) {
// // If the character matches the current character we need from "hello"
// if (s.charAt(i) == target.charAt(targetIndex)) {
// targetIndex++; // Move to the next character in "hello"
// }

// // If we have matched all 5 characters of "hello", we can stop early
// if (targetIndex == 5) {
// break;
// }
// }

// // If targetIndex reached 5, it means all characters were found in order
// if (targetIndex == 5) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }

// sc.close();
// }
// }

// // Read N (string size) and Q (number of queries)
// int n = sc.nextInt();
// int q = sc.nextInt();

// // Read the initial string
// String s = sc.next();
// StringBuilder sb = new StringBuilder(s);

// // Process each query
// for (int i = 0; i < q; i++) {
// String queryType = sc.next();

// switch (queryType) {
// case "pop_back":
// // Remove the last character
// sb.deleteCharAt(sb.length() - 1);
// break;

// case "front":
// // Print the first character
// System.out.println(sb.charAt(0));
// break;

// case "back":
// // Print the last character
// System.out.println(sb.charAt(sb.length() - 1));
// break;

// case "sort":
// // Read 1-based indices, convert to 0-based
// int sortL = sc.nextInt() - 1;
// int sortR = sc.nextInt() - 1;

// // Ensure l <= r
// int startS = Math.min(sortL, sortR);
// int endS = Math.max(sortL, sortR);

// // Extract, sort, and replace the substring
// char[] subArray = sb.substring(startS, endS + 1).toCharArray();
// Arrays.sort(subArray);
// sb.replace(startS, endS + 1, new String(subArray));
// break;

// case "reverse":
// // Read 1-based indices, convert to 0-based
// int revL = sc.nextInt() - 1;
// int revR = sc.nextInt() - 1;

// int startR = Math.min(revL, revR);
// int endR = Math.max(revL, revR);

// // Reverse the specific range using a temporary StringBuilder
// StringBuilder sub = new StringBuilder(sb.substring(startR, endR + 1));
// sub.reverse();
// sb.replace(startR, endR + 1, sub.toString());
// break;

// case "print":
// // Print the character at 1-based index (pos - 1)
// int pos = sc.nextInt() - 1;
// System.out.println(sb.charAt(pos));
// break;

// case "substr":
// // Read 1-based indices, convert to 0-based
// int subL = sc.nextInt() - 1;
// int subR = sc.nextInt() - 1;

// int startSub = Math.min(subL, subR);
// int endSub = Math.max(subL, subR);

// // Print the substring range
// System.out.println(sb.substring(startSub, endSub + 1));
// break;

// case "push_back":
// // Append the given character to the end
// String x = sc.next();
// sb.append(x);
// break;
// }
// }
// sc.close();
// }
// }

// int N = sc.nextInt(); // number of test cases

// for (int t = 0; t < N; t++) {
// String S = sc.next();
// String T = sc.next();

// String result = "";
// int minLen = Math.min(S.length(), T.length());

// // merge characters one by one
// for (int i = 0; i < minLen; i++) {
// result += S.charAt(i);
// result += T.charAt(i);
// }

// // add remaining characters if any
// if (S.length() > minLen) {
// result += S.substring(minLen);
// }
// if (T.length() > minLen) {
// result += T.substring(minLen);
// }

// System.out.println(result);
// }

// sc.close();
// }
// }

// Given a string S. Determine how many times does each letter occurred in S
// String S = sc.nextLine();
// int[] count = new int[26];
// for (int i = 0; i < S.length(); i++) {
// char c = S.charAt(i);
// if (Character.isLetter(c)) {
// count[Character.toLowerCase(c) - 'a']++;
// }
// }
// for (int i = 0; i < 26; i++) {
// if (count[i] > 0) {
// System.out.println((char) (i + 'a') + " : " + count[i]);
// }
// }
// sc.close();
// }
// }

// Given a string S. Determine whether S is Palindrome or not
// String S = sc.nextLine();
// String T = new StringBuilder(S).reverse().toString();
// if (S.equals(T)) {
// System.out.println("YES");
// } else {
// System.out.println("NO");
// }
// sc.close();
// }
// }

// Given a string S. Determine whether this string is Good or Bad.
// int T = sc.nextInt();
// sc.nextLine();

// for (int i = 0; i < T; i++) {
// String s = sc.nextLine();
// if (s.contains("010") || s.contains("101")) {
// System.out.println("Good");
// } else {
// System.out.println("Bad");
// }
// }

// sc.close();
// }
// }

// String s = sc.nextLine();
// s = s.replace(',', ' ');
// StringBuilder result = new StringBuilder();
// for (char c : s.toCharArray()) {
// if (Character.isLowerCase(c)) {
// result.append(Character.toUpperCase(c));
// } else if (Character.isUpperCase(c)) {
// result.append(Character.toLowerCase(c));
// } else {
// result.append(c);
// }
// }
// System.out.println(result.toString());
// }
// }

// int t = sc.nextInt();
// sc.nextLine(); // Consume the newline character
// while (t-- > 0) {
// String S = sc.nextLine();
// if (S.length() > 10) {

// System.out.println("" + S.charAt(0) + (S.length() - 2) + S.charAt(S.length()
// - 1));

// } else {

// System.out.println(S);
// }
// }
// sc.close();
// }
// }

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
