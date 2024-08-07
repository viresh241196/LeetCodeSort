package LeetCodeSort;

import java.util.Arrays;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays {

    public static void main(String[] args) {

        //target =
        //[1,2,3,4]
        //arr =
        //[2,4,1,3]
        System.out.println(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        return Arrays.toString(target).equals(Arrays.toString(arr));
    }
}
