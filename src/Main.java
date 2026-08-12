import java.util.*;

public class Main {
    public static int containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i<nums.length;i++) {
            hashSet.add(nums[i]);
        }
        return hashSet.size();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
