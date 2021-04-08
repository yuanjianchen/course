package tech.stack.problems;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/16 14:32
 */
public class FanZhuanLianBiaoLcof {

    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while (curr != null){
           ListNode next = curr.next;
           prev = curr;
           next.next = prev;
           curr = next;
       }
       return prev;
    }


}
