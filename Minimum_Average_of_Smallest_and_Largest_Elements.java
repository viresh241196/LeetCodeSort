package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Minimum_Average_of_Smallest_and_Largest_Elements {

    public static void main(String[] args) {
        //nums = [3, 6, 8, 9]
        //Output: 7.5
        System.out.println(new Minimum_Average_of_Smallest_and_Largest_Elements().minimumAverage(new int[]{3, 6, 8, 9}));
    }

    public double minimumAverage(int[] nums) {
        var averages = new ArrayList<Double>();
        var i = 0;
        var j = nums.length - 1;
        Arrays.sort(nums);
        while(i<j){
            averages.add((double)(nums[i] + nums[j])/2);
            i++;
            j--;
        }
        Collections.sort(averages);
        return averages.get(0);
    }
}
