package tech.stack;

/**
 * -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:-UseAdaptiveSizePolicy
 */
public class GCTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1 = new byte[2 * _1MB];
        byte[] allocation2 = new byte[2 * _1MB];
        byte[] allocation3 = new byte[_1MB];
        byte[] allocation4 = new byte[_1MB];
//        alloc();
        byte[] allocation5 = new byte[_1MB];
    }


    private static void alloc() {
        byte[] allocation1 = new byte[2 * _1MB];
        byte[] allocation2 = new byte[2 * _1MB];
        byte[] allocation3 = new byte[_1MB];
        byte[] allocation4 = new byte[_1MB];
    }
}
