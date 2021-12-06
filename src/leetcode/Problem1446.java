package leetcode;

/**
 * @author fuxin
 * @times 15 mins
 * @date 2021/12/06 07:53
 * @title 1446. 连续字符
 * @url https://leetcode-cn.com/problems/consecutive-characters/
 */
public class Problem1446 {
    public static int maxPower(String s) {
        int maxCount = 1;
        int consecutiveCount = 1;
        for (int i = 1; i < s.length(); i++) {
            char charStr = s.charAt(i);
            char lastCharStr = s.charAt(i - 1);
            if (charStr == lastCharStr) {
                consecutiveCount++;
                if (consecutiveCount > maxCount) {
                    maxCount = consecutiveCount;
                }
            } else {
                consecutiveCount = 1;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }
}
