package tech.stack.pattern;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/14 19:47
 */
public class Singleton {

    private static volatile Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (Singleton.class) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

}
