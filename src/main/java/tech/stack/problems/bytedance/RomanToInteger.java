package tech.stack.problems.bytedance;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/2/28 19:10
 */
public class RomanToInteger {

    public static int romanToInt(String s) {

        char[] chars = s.toCharArray();
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i < chars.length - 1) {
                char next = chars[i + 1];
                if ((c == 'I' && (next == 'V' || next == 'X'))
                        || (c == 'X' && (next == 'L' || next == 'C'))
                        || (c == 'C' && (next == 'D' || next == 'M'))) {
                    a += getValue(next) - getValue(c);
                    i++;
                }else {
                    a += getValue(c);
                }
            } else {
                a += getValue(c);
            }

        }
        return a;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(RomanToInteger.romanToInt("MCMXCIV"));
    }
}
