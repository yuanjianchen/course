package tech.stack;

import java.util.ArrayList;
import java.util.BitSet;

public class EnsureCapacityTest {

    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//        final int n = 10000000;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < n; i++) {
//            list.add(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法前：" + (endTime - startTime));
//
//        list = new ArrayList<Object>();
//        long startTime1 = System.currentTimeMillis();
//        list.ensureCapacity(n);
//        for (int i = 0; i < n; i++) {
//            list.add(i);
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法后：" + (endTime1 - startTime1));


        BitSet bitSet = new BitSet(100);
        bitSet.set(5);
        for (int i = 0; i < 11; i++) {
            System.out.print(i);
            i = bitSet.nextClearBit(i);
            System.out.println( "___" + i);
        }

    }
}
