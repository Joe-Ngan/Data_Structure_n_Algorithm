package edu.northeastern.Question2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String sortedStr = new String(cs);
            List<String> temp = map.getOrDefault(sortedStr, new ArrayList<>());
            temp.add(str);
            map.put(sortedStr, temp);
        }
        List<List<String>> list = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
