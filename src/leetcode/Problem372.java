package leetcode;

/**
 * TODO !!!!!!
 */
public class Problem372 {
    public static int superPow(int a, int[] b) {
        int aa = 2, bb = 3;
        for (int i = 0; i < 100000; i++) {
            if (Math.pow(aa, bb) * i > 1337) {
                return 1337 - ((int) Math.pow(aa, bb) * (i - 1));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(superPow(2, new int[]{3}));
    }
}
