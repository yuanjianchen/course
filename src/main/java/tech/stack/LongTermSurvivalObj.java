package tech.stack;

import org.openjdk.jol.info.ClassLayout;

/**
 * -verbose:gc -Xms30M -Xmx30M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution -XX:+UseConcMarkSweepGC
 */
public class LongTermSurvivalObj {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] b = new byte[_1MB / 4];
        for (int i = 0; i < 1; i++) {
            byte[] c = new byte[4 * _1MB];
            byte[] d = new byte[4 * _1MB];
            c = null;
            byte[] f = new byte[4 * _1MB];
        }
    }
}
