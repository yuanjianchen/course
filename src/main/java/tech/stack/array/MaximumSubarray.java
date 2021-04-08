package tech.stack.array;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 53. 最大子序和
 * https://leetcode-cn.com/problems/maximum-subarray/
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/22 17:56
 */
public class MaximumSubarray {


    static class A implements Runnable {
        @Override
        public void run() {
            int i = 0;
            for (int j = 0; j < 1000; j++) {
                i++;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 1000; i++) {
            A command = new A();
            executor.execute(command);
        }

    }
}
