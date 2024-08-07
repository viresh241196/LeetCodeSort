package LeetCodeSort;

import java.util.Arrays;

public class Neither_Minimum_nor_Maximum {

    public static void main(String[] args) {
    //nums =
        //[3,2,1,4]
        System.out.println(findNonMinOrMax(new int[]{3, 2, 1, 4}));

    }

    public static int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 2 || nums.length == 1 || nums.length == 0){
            return -1;
        }else {
            return nums[1];
        }
    }
}
