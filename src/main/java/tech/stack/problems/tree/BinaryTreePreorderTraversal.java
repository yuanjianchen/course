package tech.stack.problems.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/14 00:27
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) continue;
            l.add(node.val);
            stack.push(node.right);
            stack.push(node.left);

        }
        return l;
    }

    void traversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        traversal(list, root.left);
        traversal(list, root.right);
    }
}
