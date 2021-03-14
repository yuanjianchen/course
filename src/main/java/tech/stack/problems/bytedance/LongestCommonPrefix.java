package tech.stack.problems.bytedance;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/2/28 20:02
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 200;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
            }
        }
        String pre = "";
        for (int i = 0; i < strs.length - 1; i++) {
            String first = strs[i].substring(0, minLength);
            String second = strs[i + 1].substring(0, minLength);
            if (first.equals(second)) {
                pre = second;
            } else {
                pre = commonPre(first, second);
            }
            if ("".equals(pre)) {
                return pre;
            }
            minLength = pre.length();
        }
        return pre;
    }

    public String longestCommonPrefix_1(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minLength = 200;
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
            }
        }
        StringBuilder pre = new StringBuilder();
        for (int j = 0; j < minLength; j++) {
            for (int i = 0; i < strs.length - 1; i++) {
                char first = strs[i].charAt(j);
                char second = strs[i + 1].charAt(j);

                if (first != second) {
                    return pre.toString();
                }
            }
            pre.append(strs[0].charAt(j));
        }

        return pre.toString();
    }


    private String commonPre(String first, String second) {
        if (first.equals(second)) {
            return second;
        } else {
            first = first.substring(0, first.length() - 1);
            second = second.substring(0, second.length() - 1);
            return commonPre(first, second);
        }
    }

    public static void main(String[] args) {
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] a = new String[]{"abbb", "a", "accc", "aa"};
        System.out.println(prefix.longestCommonPrefix_1(a));
    }
}
