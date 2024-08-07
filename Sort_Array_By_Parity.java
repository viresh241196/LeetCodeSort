package LeetCodeSort;

import java.util.Arrays;

public class Sort_Array_By_Parity {


    public static void main(String[] args) {
    //nums =
        //[3,1,2,4]
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{3, 1, 2, 4})));
    }

    public static int[] sortArrayByParity(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((a,b)->{
                    if(a % 2 ==0 && b % 2 == 0){
                        return a-b;
                    } else if (a % 2 !=0 && b % 2 != 0) {
                        return a-b;
                    } else if (a % 2 ==0 && b % 2 != 0) {
                        return -1;
                    } else{
                        return 1;
                    }
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
