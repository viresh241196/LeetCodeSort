package LeetCodeSort;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    public static void main(String[] args) {

        //nums1 =
        //[1,2,2,1]
        //nums2 =
        //[2,2]

        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        var set = new HashSet<Integer>();
        for(var num : nums1) {
            set.add(num);
        }
        return Arrays.stream(nums2).
                boxed().filter(set::contains)
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
