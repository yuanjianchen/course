package tech.stack.problems.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/16 15:08
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
//        traversal(list, root);
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                list.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return list;
    }

    private void traversal(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(list, root.left);
        traversal(list, root.right);
        list.add(root.val);
    }
}
