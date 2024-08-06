package LeetCodeSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sort_Integers_by_The_Number_of_1_Bits {

    public static void main(String[] args) {
        //arr = [0,1,2,3,4,5,6,7,8]
        //Output: [0,1,2,4,8,3,5,6,7]
        System.out.println(Arrays.toString(sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
    }

    public static int[] sortByBits(int[] arr) {
        var array = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(array, (a, b) ->{
            var aCount = countOnes(a);
            var bCount = countOnes(b);
            if(aCount != bCount){
                return Integer.compare(aCount,bCount);
            }else{
                return Integer.compare(a,b);
            }

        });
        return array.stream().mapToInt(Integer::intValue).toArray();
    }
    public  static int countOnes(int a){
        var count = 0;
        while(a!=0){
            count += a & 1;
            a >>= 1;
        }
        return count;
    }

    //using stream
    public int[] sortByBits2(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a,b)->{
                    var aCount = Integer.bitCount(a);
                    var bCount = Integer.bitCount(b);
                    if(aCount != bCount){
                        return Integer.compare(aCount,bCount);
                    }else{
                        return Integer.compare(a,b);
                    }
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
