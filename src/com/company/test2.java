import java.util.*;

class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        //1.处理nums：使用TreeMap记录个数与顺序
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        //2.处理numsDivide: 排序，从最小数开始计算
        Arrays.sort(numsDivide);
        int small = numsDivide[0];
        //2.处理numsDivide: 两两计算最小公倍数
        int min = Integer.MAX_VALUE;
        for(int i=1; i< numsDivide.length; i++){
            int gcd = getGCD(small, numsDivide[i]);
            min = Math.min(min, gcd);
            if(min == 1) {
                if(map.containsKey(1))return 0;
                else return -1;
            };//特殊数字：1
        }

        //3.再处理min：(1)如果min不为质数（4，9，15）还可以压缩..(1.1)15压缩后3可能没有,5可能有；
        List<Integer> list = isPrime(min);
        if(list.size()!=0){//对子孙进行尝试
            for(int cur : list){
                int cnt = 0;
                if(!map.containsKey(cur))continue;
                while(map.lowerEntry(cur)!=null){
                    System.out.println(min);
                    Map.Entry<Integer, Integer> entry = map.lowerEntry(cur);
                    System.out.println("当前的数字是："+entry.getKey());
                    System.out.println("当前的数字个数有："+entry.getValue());
                    cnt += entry.getValue();
                    cur = entry.getKey();
                }
                if(cnt!=0)return cnt;
            }
        }

        int cnt = 0;
        while(map.lowerEntry(min)!=null){
            Map.Entry<Integer, Integer> entry = map.lowerEntry(min);
            cnt += entry.getValue();
            min = entry.getKey();
        }
        return cnt==0&&!map.containsKey(min)? -1: cnt;

        //计算min前有多少个数字。
    }

    private List<Integer> isPrime(int src) {
        double sqrt = Math.sqrt(src);//开根号
        List<Integer> list = new ArrayList<>();
        if (src == 2 || src == 3 || src == 5) {//常见质数2,3,5
            return list;
        }
        for (int i = 2; i <= sqrt; i+=1) {
            if (src % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    private int getGCD(int small, int big) {
        if(big%small!=0){
            return getGCD(big%small, small);
        }else{
            return small;
        }
    }
}