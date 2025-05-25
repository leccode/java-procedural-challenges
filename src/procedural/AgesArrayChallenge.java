package procedural;

/**
 * Calculates the maximum element of an array
 * and returns the difference in condition is
 * met.
 *
 * - CF8 Challenges -
 *
 * @since 19/05/2025
 * @author Constantine Lekkos
 */
public class AgesArrayChallenge {
    public static void main(String[] args) {
        int[] ageArray = new int[] { 25, 89, 47, 510, 65, 36 };
        int age = 45;

        System.out.println(getAgeDiff(ageArray, age));
    }

    /**
     * Calculates the difference of
     * the given and the maximum value.
     *
     * @param ageArray Int type array.
     * @param age Defined int value of age.
     * @return the actual difference.
     */
    public static int getAgeDiff(int[] ageArray, int age) {
        if (ageArray == null || ageArray.length == 0) return 0;

        int maxValueOfArray;
        int ageDiff;

        maxValueOfArray = getMaxValueArray(ageArray);
        ageDiff = maxValueOfArray - age;

        return (ageDiff > 0) ? ageDiff : 0;
    }

    /**
     * Finds the maximum value of an array.
     *
     * @param ageArray The int type array that the maximum value
     *                 will be extracted.
     * @return the maximum int value.
     */
    public static int getMaxValueArray(int[] ageArray) {
        int maxValue;
        maxValue = ageArray[0];

        for (var element : ageArray) {
            if (element > maxValue) {
                maxValue = element;
            }
        }

        return maxValue;
    }
}
