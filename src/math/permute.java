package math;

import java.util.Arrays;
import java.util.List;

public class permute {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        permute(nums);

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> formerRes = permute(Arrays.copyOfRange(nums, 1, nums.length));
        int i=1;
        System.out.println(formerRes);
        return  null;
    }
}
