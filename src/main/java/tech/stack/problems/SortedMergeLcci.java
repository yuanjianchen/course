package tech.stack.problems;

import java.util.Arrays;

/**
 * 合并排序的数组
 * <p>
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * 说明:
 * <p>
 * A.length == n + m
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sorted-merge-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/15 21:24
 */
public class SortedMergeLcci {

    public void merge(int[] A, int m, int[] B, int n) {
        while (m > 0 && n > 0) {
            if (A[m - 1] < B[n - 1]) {
                A[m + n - 1] = B[--n];
            } else {
                A[m + n - 1] = A[--m];
            }
        }
        while (n > 0) {
            A[n - 1] = B[--n];
        }
    }


    public void merge_1(int[] A, int m, int[] B, int n) {
        int bs = 0;
        out:
        for (int i = 0; i < m; i++) {
            for (int j = bs; j < n; j++) {
                if (A[i] < B[j]) {
                    continue out;
                }
                System.arraycopy(A, i, A, i + 1, m - i);
                A[i] = B[j];
                bs++;
                m++;
            }
        }
        if (bs < n) {
            System.arraycopy(B, bs, A, m, n - bs);
        }
        System.out.println(bs);
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 5, 7, 0, 0, 0};
        int[] b = new int[]{2, 3, 6};
        SortedMergeLcci sortedMergeLcci = new SortedMergeLcci();
        sortedMergeLcci.merge(a, 4, b, 3);
        System.out.println(Arrays.toString(a));
    }
}
