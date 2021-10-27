package edu.northeastern.Q3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,-1,3,4,-1};
        int[] arr = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,1};
        System.out.println(sumOfRepeatedNums(arr));
    }

    private static int sumOfRepeatedNums(int[] arr) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer,Boolean> count = new HashMap<>();
        for(int num : arr){
            if(set.contains(num) && !count.containsKey(num)){
                count.put(num, true);
            }else {
                set.add(num);
            }
        }
        for(int key : count.keySet()){
            ans += key;
        }
        return ans;
    }

}
