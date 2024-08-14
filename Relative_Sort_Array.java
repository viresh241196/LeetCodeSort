package LeetCodeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Relative_Sort_Array {

    public static void main(String[] args) {
//arr1 =
//[2,3,1,3,2,4,6,7,9,2,19]
//arr2 =
//[2,1,4,3,9,6]
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        var result = new ArrayList<Integer>();
        for(var num : arr2) {
            for(var num2 : arr1) {
                if(num == num2){
                    result.add(num2);
                }
            }
        }
        System.out.println(result);
        var set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        Arrays.stream(arr1)
                .boxed()
                .filter(x->!set.contains(x))
                .sorted()
                .forEach(result::add);
        System.out.println(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
