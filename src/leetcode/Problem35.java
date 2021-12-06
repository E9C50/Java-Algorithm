package leetcode;

/**
 * @author fuxin
 * @times 15 mins
 * @date 2021/12/06 09:35
 * @title 35. 搜索插入位置
 * @url https://leetcode-cn.com/problems/search-insert-position/
 */
public class Problem35 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}
