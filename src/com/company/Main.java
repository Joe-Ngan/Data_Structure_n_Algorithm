package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1,3);
        List<Integer> two = Arrays.asList(2,6);
        List<Integer> three = Arrays.asList(8,10);
        List<Integer> four = Arrays.asList(15,18);
        List<List<Integer>> intervals = Arrays.asList(one,two,three,four);
        System.out.println(getMergedIntervals(intervals));
    }

    public static List<List<Integer>> getMergedIntervals(List<List<Integer>> intervals) {
        // Write your code here
        int[][] arr = new int[intervals.size()][intervals.get(0).size()];
        for(int i = 0; i< intervals.size(); i++){
            for(int j = 0; j<intervals.get(0).size(); j++){
                arr[i][j] = intervals.get(i).get(j);
            }
        }

//      int[][] arr = intervals.toArray(new int[0][0]);
//      int[][] arr = intervals.stream().map(u -> u.toArray(new int[])).toArray(int[][]::new);

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[]o1, int[]o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> lists = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(lists.size() == 0 || lists.get(lists.size() - 1)[1] < arr[i][0]) {
                lists.add(new int[]{arr[i][0], arr[i][1]});

            }
            lists.get(lists.size() - 1)[1] = Math.max(lists.get(lists.size() -1 )[1], arr[i][1]);
        }


        int[][] answer = lists.toArray(new int[0][0]);
        int[][] answer2 = lists.toArray(new int[0][0]);
        List<List<Integer>> answerList = new ArrayList<List<Integer>>();
        for(int i = 0; i < answer.length; i++) {
            List<Integer> subList = new ArrayList<Integer>();
            for(int j = 0; j < answer[i].length; j++) {
                subList.add(j, answer[i][j]);
            }
            answerList.add(i, subList);
        }
        return answerList;
    }

}