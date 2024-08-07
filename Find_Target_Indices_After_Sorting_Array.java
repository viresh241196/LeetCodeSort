package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Find_Target_Indices_After_Sorting_Array {

    public static void main(String[] args) {

    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        var list = new ArrayList<Integer>();
        IntStream.range(0,nums.length).forEach(i->{
            if(nums[i] == target){
                list.add(i);
            }
        });
        return list;

//        for(int i = 0 ; i< nums.length; i++){
//            if(nums[i] == target){
//                list.add(i);
//            }
//        }
    }
}
