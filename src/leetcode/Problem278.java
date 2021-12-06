package leetcode;

/**
 * @author fuxin
 * @times 30 mins
 * @date 2021/12/06 8:58
 * @title 278. 第一个错误的版本
 * @url https://leetcode-cn.com/problems/first-bad-version/
 */
public class Problem278 {
    static int count = 0;

    public static boolean isBadVersion(int version) {
        count++;
        return version >= 1702766719;
    }

    public static int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
        System.out.println(count);
    }
}