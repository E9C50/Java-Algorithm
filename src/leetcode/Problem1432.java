package leetcode;

/**
 * @author fuxin
 * @times 20 mins
 * @title 1432. 改变一个整数能得到的最大差值
 * @url https://leetcode-cn.com/problems/max-difference-you-can-get-from-changing-an-integer/
 */
public class Problem1432 {
    public static int maxDiff(int num) {
        String numStr = String.valueOf(num);
        String firstNum = String.valueOf(numStr.charAt(0));
        if ("-".equals(firstNum)) {
            numStr = numStr.replaceAll("-", "");
        }
        Integer temp1 = computeNum(numStr, 0, "9");
        Integer temp2 = computeNum(numStr, 0, "1");

        System.out.println(temp1);
        System.out.println(temp2);
        return temp1 - temp2;
    }

    public static int computeNum(String numStr, int firstIndex, String replaceStr) {
        if (firstIndex == numStr.length()) {
            return Integer.parseInt(numStr);
        }
        String firstChar = String.valueOf(numStr.charAt(firstIndex));
        if (replaceStr.equals(firstChar) || ("1".equals(replaceStr) && "0".equals(firstChar))) {
            return computeNum(numStr, firstIndex + 1, replaceStr);
        }
        if ("1".equals(replaceStr) && firstIndex != 0) {
            replaceStr = "0";
        }
        return Integer.parseInt(numStr.replaceAll(firstChar, replaceStr));
    }

    public static void main(String[] args) {
        int maxDiff = maxDiff(1101057);
        System.out.println(maxDiff);
    }
}
