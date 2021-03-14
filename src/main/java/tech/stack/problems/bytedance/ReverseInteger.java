package tech.stack.problems.bytedance;

/**
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * <p>
 * 输入：x = -123
 * 输出：-321
 *
 * <p>
 * 示例 3：
 * <p>
 * 输入：x = 120
 * 输出：21
 *
 * <p>
 * 示例 4：
 * <p>
 * 输入：x = 0
 * 输出：0
 *  
 * <p>
 * 提示：
 * <p>
 * -2^31 <= x <= 2^31 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/2/28 12:09
 */
public class ReverseInteger {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // Integer.MAX_VALUE
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            // Integer.MIN_VALUE
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;

    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(ReverseInteger.reverse(-1234));
        System.out.println('0' + 0);
    }
}
