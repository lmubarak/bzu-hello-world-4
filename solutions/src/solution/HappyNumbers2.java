package solution;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution for Happy Numbers2
 * Number of happy numbers to n will be always n / 2.
 *
 * @author Laith Mubarak
 * @see <a>https://www.hackerrank.com/contests/bzu-hello-world-4/challenges/happy-numbers-2-2</a>
 * @since July 01, 2021
 */
public class HappyNumbers2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();

        // Result will be always n / 2
        BigInteger result = n.divide(new BigInteger(2 + ""));
        System.out.println(result);
        in.close();
    }
}
