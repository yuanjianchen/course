package tech.stack.problems.bytedance;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例 1：
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * <p>
 * <p>
 * 示例 2：
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * <p>
 * <p>
 * 示例 3：
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *  
 * <p>
 * 提示：
 * <p>
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * <p>
 * <p>
 * Definition for singly-linked list.<p>
 * public class ListNode {<p>
 * int val;<p>
 * ListNode next;<p>
 * ListNode() {}<p>
 * ListNode(int val) { this.val = val; }<p>
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }<p>
 * }
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/2/28 23:34
 */
public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            printVal(sb, this);
            return sb.append("]").toString();
        }

        void printVal(StringBuilder sb, ListNode node) {
            if (node == null) {
                return;
            }
            sb.append(node.val);
            printVal(sb, node.next);
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    private ListNode extracted(ListNode l1, ListNode l2, ListNode l) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l.val = l1.val;
            l.next = extracted(l1.next, l2, new ListNode());
        } else {
            l.val = l2.val;
            l.next = extracted(l2.next, l1, new ListNode());
        }
        return l;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(3, new ListNode(5, new ListNode(7, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(6, null))));
//        ListNode l1 = new ListNode(1, null);
//        ListNode l2 = new ListNode(2, null);
//        ListNode l1 = null;
//        ListNode l2 = null;
        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1, l2));
    }
}
