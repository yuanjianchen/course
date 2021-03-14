package tech.stack;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2020/8/14 00:22
 */
public class SuperClass {

    public static int superClassField = 1;

    static {
        System.out.println("Supper static code");
    }

    public SuperClass() {
        System.out.println("Supper constructor");
    }
}
