package solution;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Solution for TwoCubes question.
 * Cube surface area = l * l * 6, where l is the length of the cube, 6 is the number of square faces.
 * We have two cube but they are placed on each other, so surface area will be:
 * surface area = (l1 * l1 * 5) + (l2 * l2 * 5) + intersection area.
 * intersection area will be calculated by the getting the difference between the areas of the two faces.
 * surface area = (l1 * l1 * 5) + (l2 * l2 * 5) + ((max * max) - (min * min)), where max is max length between the two cubes, and min the min between them.
 *
 * @author Laith Mubarak
 * @see <a>https://www.hackerrank.com/contests/bzu-hello-world-4/challenges/two-cubes</a>
 * @since June 25, 2021
 */
public class TwoCubes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l1 = in.nextLong();
        long l2 = in.nextLong();
        // Using BigInteger to avoid overflow.
        BigInteger bigInteger1 = new BigInteger(l1 + "");
        BigInteger bigInteger2 = new BigInteger(l2 + "");
        BigInteger surfaceAreaWithoutIntersection1 = bigInteger1.multiply(new BigInteger(l1 * 5 + ""));
        BigInteger surfaceAreaWithoutIntersection2 = bigInteger2.multiply(new BigInteger(l2 * 5 + ""));
        BigInteger result =  surfaceAreaWithoutIntersection1.add(surfaceAreaWithoutIntersection2);
        // Adding the intersection surface area.
        if (l1 != l2) {
            BigInteger max = new BigInteger(Math.max(l1, l2) + "");
            BigInteger min = new BigInteger(Math.min(l1, l2) + "");
            BigInteger intersectionArea = max.pow(2).subtract(min.pow(2));
            result = result.add(intersectionArea);
        }

        System.out.println(result);
        in.close();
    }

}


