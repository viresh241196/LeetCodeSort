package LeetCodeSort;

import java.util.Arrays;

public class Delete_Greatest_Value_in_Each_Row {

    public static void main(String[] args) {

        // grid =
        //[[1,2,4],[3,3,1]]
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        var ans = 0;
        for(var row : grid){
            Arrays.sort(row);
        }
        for(int i = grid[0].length -1 ; i>=0; i--){
            int max = 1;
            for(var row : grid){
                max = Math.max(row[i],max);
            }
            ans += max;
        }
        return ans;
    }
}
