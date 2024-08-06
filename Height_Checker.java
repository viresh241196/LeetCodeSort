package LeetCodeSort;

import java.util.Arrays;

public class Height_Checker {

    public static void main(String[] args) {
    //heights = [1,1,4,2,1,3]
    //Output: 3
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }

    public static int heightChecker(int[] heights) {
        // var expected = Arrays.copyOf(heights, heights.length);
        var expected = heights.clone();
        Arrays.sort(expected);
        var count = 0;
        for(int i= 0 ; i< heights.length ; i++){
            if(!(heights[i] == expected[i])){
                count++;
            }
        }
        return count;
    }
}
