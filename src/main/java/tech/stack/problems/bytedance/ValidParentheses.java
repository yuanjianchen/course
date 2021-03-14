package tech.stack.problems.bytedance;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * <p>
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * <p>
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * <p>
 * 示例 4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * <p>
 * 示例 5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/2/28 21:22
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(stack.size() > chars.length/2){
                return false;
            }
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid("(([]){})"));
    }
}
