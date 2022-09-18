import java.math.BigDecimal;
import java.text.DecimalFormat;

class ComeAndHelpUs{
    public static void main(String[] args) {
        System.out.println(deal(new int[]{1,2,3,4,5,6,3,2,4,5,3,5,3,2,7,9,11}));
    }

    private static float deal(int[] nums) {
        int size = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return (float)Math.round(((float)sum/size)*100)/100;
    }

}