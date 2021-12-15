package edu.northeastern.Question3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1};
        int k = 2;
        System.out.println(contentiousSubarray(nums, k));
    }

    public static int contentiousSubarray(int[] nums, int k){
        int sum = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                cnt += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
