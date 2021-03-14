package tech.stack.problems.tree;

/**
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/13 23:38
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(deep(root.right) - deep(root.left)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int deep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(deep(node.right), deep(node.left)) + 1;
    }


    public static void main(String[] args) {

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
