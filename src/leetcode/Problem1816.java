package leetcode;

/**
 * @author fuxin
 * @times 10 mins
 * @date 2021/12/26 7:22
 * @title 1816. 截断句子
 * @url https://leetcode-cn.com/problems/truncate-sentence/
 */
public class Problem1816 {
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                return sb.toString();
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }
}
