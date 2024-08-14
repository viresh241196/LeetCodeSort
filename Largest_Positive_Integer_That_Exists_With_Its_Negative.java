package LeetCodeSort;

import java.util.Arrays;
import java.util.HashSet;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative {

    public static void main(String[] args) {

        //nums = [3,2,-2,5,-3]
        //Output: 3
        System.out.println(findMaxK(new int[]{3, 2, -2, 5, -3}));
    }

    public static int findMaxK(int[] nums) {
        var set = new HashSet<Integer>();
        var max =-1;
        for (int el : nums) {
            if (set.contains(-el)) max = Math.max(max, Math.abs(el));
            set.add(el);
        }
        return max;
    }
}
