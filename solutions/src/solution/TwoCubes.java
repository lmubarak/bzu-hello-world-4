package solution;

import java.util.Scanner;

/**
 * Solution for TwoCubes question.
 *
 * @author Laith Mubarak
 * @see <a>https://www.hackerrank.com/contests/bzu-hello-world-4/challenges/two-cubes</a>
 * @since July 1, 2021
 */
public class TwoCubes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l1 = in.nextInt();
        int l2 = in.nextInt();

    }

    public static long surfaceAreaWithoutIntersection(int l1, int l2) {
        return (l1 + l2) * 5;
    }

/*    public static long intersectionSurfaceArea(int l1, int l2) {
        Math.max(l1, l2) - Math.min(l1, l2)
    }*/
}
