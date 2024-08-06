package LeetCodeSort;

import java.util.Arrays;

public class Array_Partition {

    public static void main(String[] args) {

        //nums = [6,2,6,5,1,2]
        //Output: 9
        System.out.println(new Array_Partition().arrayPairSum(new int[]{6,2,6,5,1,2}));
    }

    public int arrayPairSum(int[] nums) {
        var sum = 0;
        Arrays.sort(nums);
        for(int i = 0 ;i < nums.length; i = i+2){
            sum += Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}
