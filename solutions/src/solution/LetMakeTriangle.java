package solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Solution for Let's Make a Triangle question.
 * Mathematically, sum of any two sides of the a triangle must be greater than the third side.
 * If we have a triangle with a, b and c sides, then:
 * 1. a + b > c
 * 2. a + c > b
 * 3. b + c > a
 * <p>
 * To solve the question, we have to make sure that the above rule applies.
 * if max = max of a, b and c, then:
 * max should be less than the other two sides.
 * max + any other number (a or b or c) is always greater than any other number.
 * <p>
 * if max is less than the sum of the two other sides, then result will be 0.
 * if max is greater than the sum of the two other sides, then we have add a another number to the two sides to make them greater than max.
 * The added value will be: (max - sum of the two other sides + 1).
 *
 * @author Laith Mubarak
 * @see <a>https://www.hackerrank.com/contests/bzu-hello-world-4/challenges/lets-make-a-triangle</a>
 * @since July 2, 2021
 */
public class LetMakeTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 3;
        int [] arr = new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
        }
        // Sort in ascending order.
        Arrays.sort(arr);

        //arr[2] is max value.
        int result = arr[2] - (arr[1] + arr[0]) + 1;
        System.out.println(result<0?"0":result);
        in.close();
    }
}
