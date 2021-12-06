package leetcode;

import java.util.Arrays;

/**
 * @author fuxin
 * @times 20 mins
 * @date 2021/12/06 8:22
 * @title 704. 二分查找
 * @url https://leetcode-cn.com/problems/binary-search/
 */
public class Problem704 {
    public static int search(int[] nums, int target) {
        return solution(nums, target, 0);
    }

    public static int solution(int[] nums, int target, int startIndex) {
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }
        int middleIndex = nums.length / 2;
        int middleValue = nums[middleIndex];
        if (middleValue > target) {
            nums = Arrays.copyOfRange(nums, 0, middleIndex);
        } else if (middleValue < target) {
            nums = Arrays.copyOfRange(nums, middleIndex, nums.length);
            startIndex = startIndex + middleIndex;
        } else {
            return startIndex + middleIndex;
        }
        return solution(nums, target, startIndex);
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{0, 3, 5, 9, 12}, 5));
    }
}
