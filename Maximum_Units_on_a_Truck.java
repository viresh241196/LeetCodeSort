package LeetCodeSort;

import java.util.Arrays;

public class Maximum_Units_on_a_Truck {

    public static void main(String[] args) {

        //boxTypes =
        //[[1,3],[2,2],[3,1]] truckSize = 4
        System.out.println(maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        var box = 0 ;
        var units = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        for(var entry : boxTypes){
            for(int i = entry[0];i>0;i--){
                if(box >= truckSize){
                    break;
                }
                units += entry[1];
                box++;
            }
            if(box >= truckSize){
                break;
            }
        }
        return units;
    }

    //simple solution
    //    public int maximumUnits(int[][] boxTypes, int truckSize) {
    //       var box = 0 ;
    //       var units = 0;
    //        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));
    //        for(var entry : boxTypes){
    //            var boxCount = entry[0];
    //            var currentUnits = entry[1];
    //            var boxToAdd = Math.min(boxCount,truckSize-box);
    //            units += boxToAdd * currentUnits;
    //            box += boxToAdd;
    //            if(box >= truckSize){
    //                    break;
    //                }
    //        }
    //        return units;
    //    }
}
