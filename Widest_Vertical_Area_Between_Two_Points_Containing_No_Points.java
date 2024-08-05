package LeetCodeSort;

import java.util.Arrays;

public class Widest_Vertical_Area_Between_Two_Points_Containing_No_Points {

    public static void main(String[] args) {
        //points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
        System.out.println(maxWidthOfVerticalArea(new int[][]{{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}}));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(points));
        int maxWidth = 0;

        for(int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i-1][0];

            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }
}
