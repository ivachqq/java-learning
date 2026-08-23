import java.util.*;

public class Main {
    public static double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        double best = 0;
        for (int i = 0; i<=r;i++) {
            best+=nums[i];
        }
        best/=k;
        double curr = best;
        while (r<nums.length-1) {
            curr-=(nums[l]/(double)k);
            l+=1;
            r+=1;
            curr+=(nums[r]/(double)k);
            best = Math.max(curr, best);
        }
        return best;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}
