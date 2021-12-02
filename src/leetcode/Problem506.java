package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fuxin
 * @times 20 mins
 * @title 506. 相对名次
 * @url https://leetcode-cn.com/problems/relative-ranks/
 */
public class Problem506 {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            int biggerNum = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > score[i]) {
                    biggerNum++;
                }
            }
            String index = String.valueOf(biggerNum + 1);
            index = "1".equals(index) ? "Gold Medal" : index;
            index = "2".equals(index) ? "Silver Medal" : index;
            index = "3".equals(index) ? "Bronze Medal" : index;
            map.put(i, index);
        }

        return map.values().toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Problem506().findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }
}
