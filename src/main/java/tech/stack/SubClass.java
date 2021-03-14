package tech.stack;

import java.util.concurrent.TimeUnit;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2020/8/14 00:22
 */
public class SubClass  extends SuperClass implements SuperInterface {

    public static int subClassField = 20;

    static {
        System.out.println("sub class static code.");
    }

    public SubClass() {
        System.out.println("sub class constructor");
    }
}
