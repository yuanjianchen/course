package tech.stack.problems;

import java.util.Stack;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/14 01:50
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
            if(head.next == null){
                return true;
            }
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        while (head.next != null) {
            if (stack.peek() == head.next.val) {
                stack.removeElementAt(stack.size() - 1);
            } else {
                stack.push(head.next.val);
            }
            head = head.next;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ListNode  node = new ListNode(1);
        PalindromeLinkedList linkedList = new PalindromeLinkedList();
        System.out.println(linkedList.isPalindrome(node));
    }
}
