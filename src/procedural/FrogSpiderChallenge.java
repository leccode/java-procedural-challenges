package procedural;

/**
 * 2 frogs try to catch a
 * spider. A method with
 * 3 integers as parameters
 * represent their position.
 * Find the difference of them
 * and print the correct message.
 *
 * - CF8 Challenges -
 *
 * @since 19/05/2025
 * @author Constantine Lekkos
 */
public class FrogSpiderChallenge {
    public static void main(String[] args) {
        int[][] testData = {
                {-1, 2, 3},
                {7, 3, 2},
                {2, 4, -3},
                {1, 2, 1},
                {14, 12, 10}
        };

        for (int i = 0; i < testData.length; i++) {
            frogSpiderCatch(testData[i][0], testData[i][1], testData[i][2]);
        }
    }

    /**
     * The absolute space of the 2
     * frogs is calculated
     * and the minimum is
     * the actual result
     * and the relative object
     * is printed by the console.
     *
     * @param a Position of frog 1
     * @param b Position of frog 2
     * @param c Position of spider
     */
    public static void frogSpiderCatch (int a, int b, int c) {
        int frogAPosition;
        int frogBPosition;

        frogAPosition = Math.abs(Math.abs(a) - Math.abs(c));
        frogBPosition = Math.abs(Math.abs(b) - Math.abs(c));

        if (frogAPosition == frogBPosition) {
            System.out.println("Spider");
        }
        if (frogAPosition < frogBPosition) {
            System.out.println("1st Frog");
        }
        if (frogBPosition < frogAPosition) {
            System.out.println("2st Frog");
        }
    }
}
