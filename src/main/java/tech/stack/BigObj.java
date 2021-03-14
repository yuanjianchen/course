package tech.stack;

/**
 * -Xmx30m -Xms30m -XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -XX:PretenureSizeThreshold=3145728
 */
public class BigObj {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] b = new byte[3 * _1MB ];
    }
}
