package solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for Two Strings 2 Question.
 * There are two approaches to solve this question:
 * 1. Solving it using sort.
 * 2. Solving it by count the number of occurrences of each letter in each string.
 *
 * @author Laith Mubarak
 * @see <a>https://www.hackerrank.com/contests/bzu-hello-world-4/challenges/two-strings-2</a>
 * @since July 1, 2021
 */
public class TwoStrings2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(sortApproach(s1, s2) ? "yes" : "no");
        //System.out.println(countApproach(s1, s2)?"yes":"no");
        in.close();
    }

    /**
     * This approach will sort the two strings alphabetically.
     * If the they have the same number of occurrences of each letter, then they will have the same order of each letter after sorting.
     *
     * @param s1 first string.
     * @param s2 second string.
     * @return true if the two strings are equal. Otherwise, false.
     */
    public static boolean sortApproach(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = sortString(s1);
        s2 = sortString(s2);

        return s1.equals(s2);
    }

    /**
     * Sort a string alphabetically.
     *
     * @param s string to be sorted.
     * @return sorted string.
     */
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


    /**
     * Two strings are said to be equal if they have the same number of each occurrences of every letter.
     * As the two strings consist only from lower letters (26 letters), we can create two arrays (size = 26) for each string to count the number of occurrences of every letter, then compare between the two arrays,
     * if they identical, then the two strings are equal, otherwise not equal.
     *
     * @param s1 first string.
     * @param s2 second string.
     * @return true if the two strings are equal. Otherwise, false.
     */
    public static boolean countApproach(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count1 = getCountOfLettersForString(s1);
        int[] count2 = getCountOfLettersForString(s2);

        if (equals(count1, count2)) {
            return true;
        }
        return false;
    }

    /**
     * Will count of the number of occurrences of every letter.
     * Number of occurrences will of letter a will be stored at index 0, b at index 1, ..., z at index 25.
     *
     * @param s string to count the number of occurrences of every letter. s consists only from lower letters.
     * @return array of int contain the number of occurrences of every letter, Array size will 26.
     */
    public static int[] getCountOfLettersForString(String s) {
        // Only lower letters.
        int numberOfLetters = 26;
        int[] count = new int[numberOfLetters];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        return count;
    }

    /**
     * Compare between two arrays of int. If these two arrays have the same values at each index, then they are equal.
     *
     * @param arr1 first array to be compared.
     * @param arr2 second array to be compared.
     * @return true of the two arrays has same value at each index. Otherwise, false.
     */
    public static boolean equals(int[] arr1, int[] arr2) {
        // If the arrays have different values, then they are not equal.
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            // If the values at some index aren't equal, then the arrays are not equal.
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // If each values at each index are equal, then the two arrays are equal.
        return true;
    }
}
