package edu.northeastern.Q4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }

    private static String longestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        String max = "";
        int[] count = new int[128];
        while(r<n){
            while(l<r && count[s.charAt(r)-' ']>0){
                count[s.charAt(l)-' ']--;
                l++;
            }
            while(r<n && count[s.charAt(r)-' ']==0){
                count[s.charAt(r)-' ']++;
                r++;
                if(r-l>max.length()){
                    max=s.substring(l,r);
                }
            }
        }
        return max;
    }
}
