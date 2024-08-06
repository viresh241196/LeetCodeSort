package LeetCodeSort;

import java.util.ArrayList;
import java.util.Collections;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits {

    public static void main(String[] args) {
        System.out.println(minimumSum(1234));
    }

    public static int  minimumSum(int num) {
        var list = new ArrayList<String>();
        while(num>0){
            list.add(String.valueOf(num % 10));
            num /= 10;
        }
        Collections.sort(list);
        var new1 = list.get(0) + list.get(3);
        var new2 = list.get(1) + list.get(2);
        return Integer.parseInt(new1) + Integer.parseInt(new2);
    }
}
