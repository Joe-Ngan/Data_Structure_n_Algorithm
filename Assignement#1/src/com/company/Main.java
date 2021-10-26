package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums11 = new int[]{1,2,3,4,5};
        int[] nums12 = new int[]{1,2,1,2,1,2,1,3,4,3,5};
        System.out.println("Question 1 answer:" + uniElementSum(nums11));
        System.out.println("Question 1 answer:" + uniElementSum(nums12));

        int[] nums21 = new int[]{-4,-1,0,3,10};
        int[] nums22 = new int[]{-5,-4,-3,-2,0,2,3,4,6};
        System.out.println("Question 2 answer:" + Arrays.toString(squareAndSort(nums21)));
        System.out.println("Question 2 answer:" + Arrays.toString(squareAndSort(nums22)));

        int[] arr31 = new int[]{2,3,4,2,2,3,5,7};
        int[] arr32 = new int[]{1,3,5,6,4,2,7,8,9,0,9,6,5,3,1,2,4,8,6,5,7};
        System.out.println("Question 3 answer:" + nonRepeatedInt(arr31));
        System.out.println("Question 3 answer:" + nonRepeatedInt(arr32));

        String ransomNote1 = new String("a");
        String ransomNote2 = new String("aqmpbv");
        String magazine1 = new String("aab");
        String magazine2 = new String("dslkgjsrtioucx");
        System.out.println("Question 4 answer:" + constructNote(ransomNote1, magazine1));
        System.out.println("Question 4 answer:" + constructNote(ransomNote2, magazine2));

        String string41 = "oo1";
        String string42 = "1s2d3f4g56h7jk9l0";
        System.out.println("Question 5 answer:" + letterByDigit(string41));
        System.out.println("Question 5 answer:" + letterByDigit(string42));

    }

    public static int uniElementSum(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;

        if(n == 0){
            return 0;
        }if(n==1){
            return nums[0];
        }

        int count = 0;

        for(int i = 0; i<n; i++){
            if(i>=1 && nums[i]==nums[i-1]){
                continue;
            }
            if(i<n-1 && nums[i]!=nums[i+1]){
                count = count + nums[i];
            }
            if(i==n-1 && nums[i]!=nums[i-1]){
                count = count + nums[i];
            }
        }
        return count;
    }

    public static int[] squareAndSort(int[] nums){
        int l = 0;
        int r = nums.length-1;
        int i = nums.length-1;
        int[] ans = new int[nums.length];

        while(l<=r){
            if(nums[l]*nums[l] >= nums[r]*nums[r]){
                ans[i--] = nums[l]*nums[l];
                l++;
            }else{
                ans[i--] = nums[r]*nums[r];
                r--;
            }
        }
        return ans;
    }

    public static int nonRepeatedInt(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0; i< nums.length; i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }

    public static boolean constructNote(String ransomNote, String magazine){
        int[] check = new int[128];
        for(int i = 0; i<magazine.length(); i++){
            check[magazine.charAt(i)]++;
        }
        for(int i = 0; i<ransomNote.length(); i++){
            check[ransomNote.charAt(i)]--;
            if(check[ransomNote.charAt(i)]<0){
                return false;
            }
        }
        return true;
    }

    public static boolean letterByDigit(String str){
        int n = str.length();
        if (n==0 || n==1){
            return true;
        }
        for(int i = 0; i<n; i++){
            if(i>=1 && str.charAt(i)<60 && str.charAt(i-1)<60){
                return false;
            }else if(i>=1 && str.charAt(i)>60 && str.charAt(i-1)>60){
                return false;
            }
        }
        return true;
    }
}
