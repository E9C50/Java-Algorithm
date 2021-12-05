package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author fuxin
 * @times 10 mins
 * @date 2021/11/28 11:37
 * @title 1. 两数之和
 * @url https://leetcode-cn.com/problems/two-sum/
 */
public class Problem1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                return new int[]{i, hash.get(nums[i])};
            }
            hash.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
